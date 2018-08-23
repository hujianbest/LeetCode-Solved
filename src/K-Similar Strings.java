import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//当涉及到最少步子时，你就应该想到BFS
class Solution {
    public int kSimilarity(String A, String B) {
        if(A.equals(B)) return 0;
        Set<String> vis = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(A);
        vis.add(A);
        int res = 0;

        while(!queue.isEmpty()){
            res++;
            for(int i=queue.size();i>0;i--){
                String s = queue.poll();
                int j = 0;
                while(s.charAt(j) == B.charAt(j)) j++;
                for(int k=j+1;k<s.length();k++){
                    if(s.charAt(k)==B.charAt(k)||s.charAt(k)!=B.charAt(j)) continue;
                    String tmp = swap(s,j,k);
                    if(tmp.equals(B)) return res;
                    if(vis.add(tmp)) queue.add(tmp);
                }
            }
        }
        return res;
    }

    public String swap(String s, int i, int j) {
        char[] ca=s.toCharArray();
        char temp=ca[i];
        ca[i]=ca[j];
        ca[j]=temp;
        return new String(ca);
    }
}