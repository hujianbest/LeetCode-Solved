class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
		    return new ArrayList<Integer>();
        int counter1=0;
        int counter2=0;
        int candidate1=nums[0];
        int candidate2=nums[0];
        List<Integer> result = new ArrayList<>();
        for(int n:nums){
            if(n==candidate1)
                counter1++;
            else if(n==candidate2)
                counter2++;
            else if(counter1==0){
                candidate1=n;
                counter1=1;
            }else if(counter2==0){
                candidate2=n;
                counter2=1;
            }else{
                counter1--;
                counter2--;
            }
        }
        counter1=0;
        counter2=0;
        for(int n:nums){
            if(candidate1==n)
                counter1++;
            if(candidate2==n)
                counter2++;
        }
        if(counter1>nums.length/3)
            result.add(candidate1);
        if(candidate1!=candidate2&&counter2>nums.length/3)
            result.add(candidate2);
        return result;
    }
}