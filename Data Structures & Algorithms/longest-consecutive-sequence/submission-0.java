class Solution {
    public int longestConsecutive(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int num : nums) {
            lst.add(num);
        }
        int output = 0;
        for(int x:lst){
            int num = x - 1;
            int newOut = 1;
            while(lst.contains(num)){
                newOut += 1;
                num = num - 1;
            }
            output = Math.max(output,newOut);
        }
        return output;
    }
}
