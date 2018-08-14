class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> myMap = new HashMap<>();
        char[] c = s.toCharArray();
        int min = c.length;
        for(int i=0;i<c.length;i++){
            if(!myMap.containsKey(c[i])){
                myMap.put(c[i],i);
            }else
                myMap.replace(c[i],-1);
        }
        List<Integer> values = new ArrayList<>(myMap.values());
        for(int value : values){
            if(value>=0)
                min = Math.min(min,value);
        }
        if(min == c.length)
            return -1;
        else
            return min;
    }
}