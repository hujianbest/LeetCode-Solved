class Solution {
    public void merge(int[] A1, int m, int[] A2, int n) {
        int i=m-1,j=n-1,length=m+n-1;
        while(i>=0 && j>=0){
            if(A1[i]<A2[j]){
                A1[length--]=A2[j];
                j--;
            }else{
                A1[length--]=A1[i];
                i--;
            }
        }
        while(j>=0){
            A1[length--]=A2[j];
            j--;
        }
    }
}