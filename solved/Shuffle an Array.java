class Solution {
    private int[] nums;
    private int[] numscopy;
    private Random random;
    public Solution(int[] nums) {
        this.nums=nums;
        numscopy=nums.clone();
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums==null)
            return null;
        int tmp;
        int j;
        for(int i=1;i<numscopy.length;i++){
            j=random.nextInt(i+1);
            tmp=numscopy[i];
            numscopy[i]=numscopy[j];
            numscopy[j]=tmp;
        }
        return numscopy;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */