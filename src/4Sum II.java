class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> AB = new HashMap<>();
        for(int i=0;i<A.length;i++)
            for(int j=0;j<B.length;j++){
                int sum;
                sum = A[i]+B[j];
                AB.put(sum,AB.getOrDefault(sum,0)+1);
            }
        int res=0;
        for(int i=0;i<C.length;i++)
            for(int j=0;j<D.length;j++){
                int sum;
                sum=C[i]+D[j];
                res+=AB.getOrDefault(-1*sum,0);
            }
        return res;
    }
}