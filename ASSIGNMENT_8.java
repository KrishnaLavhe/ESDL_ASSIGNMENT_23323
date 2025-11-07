import java.util.ArrayList;
import java.util.List;

public class Assign8{
    public static void computeLPSArray(String pattern, int[] lps){
        int length = 0;
        int i = 1;
        lps[0] = 0;

        while(i < pattern.length()){
            if(pattern.charAt(i) == pattern.charAt(length)){
                length++;
                lps[i] = length;
                i++;
            }
            else{
                if(length != 0){
                    length = lps[length - 1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static List<Integer> KMPSearch(String text, String pattern){
        int[] lps = new int[pattern.length()];
        computeLPSArray(pattern, lps);

        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < text.length()){
            if(pattern.charAt(j) == text.charAt(i)){
                i++;
                j++;
            }

            if(j == pattern.length()){
                result.add(i - j);
                j = lps[j - 1];
            }
            else if(i < text.length() && pattern.charAt(j) != text.charAt(i)){
                if(j != 0){
                    j = lps[j - 1];
                }
                else{
                    i++;
                }
            }
        }
            return result;
    }

    public static void main(String[] args){
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        List<Integer> result = KMPSearch(text, pattern);

        System.out.print("Starting indices: ");
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i));
            if(i < result.size() - 1){
                System.out.print(", ");
            }
        }
    }
}
