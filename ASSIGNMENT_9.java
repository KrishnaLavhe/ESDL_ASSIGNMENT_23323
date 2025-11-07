import java.util.*;

public class Assign9{
        public static int[] buildSuffixArray(String s){
        int n = s.length();
        int[] suffixArray = new int[n];
        int[] rank = new int[n];
        int[] tempRank = new int[n];
        
        for(int i = 0; i < n; i++){
            suffixArray[i] = i;
            rank[i] = s.charAt(i) - 'a';  
        }
        
        for(int k = 1; k < n; k *= 2){
            final int kFinal = k;
            Arrays.sort(suffixArray, (a, b)->{
                if(rank[a] != rank[b]) return Integer.compare(rank[a], rank[b]);
                int rankA = a + kFinal < n ? rank[a + kFinal] : -1;
                int rankB = b + kFinal < n ? rank[b + kFinal] : -1;
                return Integer.compare(rankA, rankB);
            });

            tempRank[suffixArray[0]] = 0;
            for (int i = 1; i < n; i++) {
                if (rank[suffixArray[i]] == rank[suffixArray[i - 1]] && 
                    (suffixArray[i] + k < n && suffixArray[i - 1] + k < n &&
                     rank[suffixArray[i] + k] == rank[suffixArray[i - 1] + k])) {
                    tempRank[suffixArray[i]] = tempRank[suffixArray[i - 1]];
                } else {
                    tempRank[suffixArray[i]] = tempRank[suffixArray[i - 1]] + 1;
                }
            }
            System.arraycopy(tempRank, 0, rank, 0, n);
        }
        
        return suffixArray;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int[] suffixArray = buildSuffixArray(s);
        
        for (int i = 0; i < suffixArray.length; i++) {
            System.out.print(suffixArray[i] + " ");
        }
    }
}
