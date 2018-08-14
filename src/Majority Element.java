class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> sortnums=new ArrayList<>();
        int count=0;
        int re=0;
        if(nums.length>1){
            for(int i=0;i<nums.length;i++){
                sortnums.add(nums[i]);
            }
            Collections.sort(sortnums);
            for(int i=0;i<nums.length;i++){
                nums[i]=sortnums.get(i);
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]==nums[i+1]){
                    count++;
                    if(count>=nums.length/2){
                        re=nums[i];
                        break;
                    }
                }else
                    count=0;       
            }
        }else
            re=nums[0];
        return re;
    }
}