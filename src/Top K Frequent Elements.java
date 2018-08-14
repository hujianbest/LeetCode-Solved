class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];
        for (int n : nums) {
		    map.put(n, map.getOrDefault(n, 0) + 1);
	    }
        for(int key:map.keySet()){
            int fre = map.get(key);
            if(bucket[fre]==null)
                bucket[fre]=new ArrayList<>();
            bucket[fre].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int pos = bucket.length-1;pos>=0&&res.size()<k;pos--){
            if(bucket[pos]!=null)
                res.addAll(bucket[pos]);
        }
        return res;
    }
}