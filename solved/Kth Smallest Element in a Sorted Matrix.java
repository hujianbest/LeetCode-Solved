class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // int n = matrix.length;
        // int i;
        // for(i=0;i<n;i++){
        //     if(k>i*i && k<=(i+1)*(i+1))  break;
        // }
        // List<Integer> result = new ArrayList<>();
        // for(int j=0;j<i+1;j++){
        //     result.add(matrix[i][j]);
        //     result.add(matrix[j][i]);
        // }
        // Collections.sort(result);
        // return result.get(k-i*i-1);
        
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];
        while(left<right){
            int mid = (left+right)/2;
            int count = 0;
            int j = n-1;
            for(int i=0;i<n;i++){
                while(j>=0 && matrix[i][j]>mid) j--;
                count+=j+1;
            }
            if(count<k) left=mid+1;
            else right=mid;
        }
        return left;
        

//         int m = matrix.length;
//         int n = matrix[0].length;
//         List<Integer> list = new LinkedList<>();
//         for(int i = 0;i<m;i++){
//             guibing(list,matrix[i]);
//         }
//         return list.get(k-1);
//     }
    
//     public void guibing(List<Integer> list,int[] tmp){
//         for(int i = 0;i<tmp.length;i++){
//             add(list,tmp[i]);
//         }
//     }
//     public void add(List<Integer> list,int n){
//         for(int i=0;i<list.size();i++){
//             if(n<=list.get(i)){
//                 list.add(i,n);
//                 return;
//             }
//         }
//         list.add(n);
    }
}