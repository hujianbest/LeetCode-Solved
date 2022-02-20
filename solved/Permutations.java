class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        backtrac(result,tmp,nums);
        return result;
        
    }
    public void backtrac(List<List<Integer>> resultList, List<Integer> serial, int[] nums){
        List<Integer> tmp = new ArrayList<>(serial);
        if(tmp.size()==nums.length){
            resultList.add(tmp);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(tmp.contains(nums[i])){
                continue;
            }
            tmp.add(nums[i]);
            backtrac(resultList,tmp,nums);
            tmp.remove(tmp.size()-1);
        }
    }
}