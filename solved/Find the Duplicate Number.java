class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> idx = new HashMap<>();
        for(Integer i : nums){
            idx.put(i,idx.getOrDefault(i,0)+1);
        }
        for(Integer i : idx.keySet()){
            if(idx.get(i)>1) return i;
        }
        return 0;
    }
}