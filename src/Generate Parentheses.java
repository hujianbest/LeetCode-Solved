class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTracking(result,"",0,0,n);
        return result;
    }
    public void backTracking(List list,String str,int left,int right,int len){
        if(str.length()==len*2){
            list.add(str);
            return;
        }
        if(left<len){
            backTracking(list,str+"(",left+1,right,len);
        }
        if(right<left){
            backTracking(list,str+")",left,right+1,len);
        }
    }
}