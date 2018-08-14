class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<Integer> firstline = new LinkedList<>();
        List<Integer> preline = new LinkedList<>();
        firstline.add(0,1);
        preline=firstline;
        for(int i= 0;i<numRows;i++){
            result.add(i,preline);
            preline=generateNextLine(preline);
        }
        return result;
    }
    public List<Integer> generateNextLine(List<Integer> preline){
        List<Integer> nextline = new LinkedList<>();
        nextline.add(0,1);
        for(int i=1;i<preline.size();i++)
            nextline.add(i,preline.get(i-1)+preline.get(i));
        nextline.add(preline.size(),1);
        return nextline;
    }
}