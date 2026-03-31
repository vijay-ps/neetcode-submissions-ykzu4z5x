class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> lst = new HashSet<>();
        for (int num : nums) {
            lst.add(num);
        }
        int output = 0;
        for(int x:lst){
            int newOut = 1;
            while(lst.contains(x-1)){
                newOut++;
                x--;
            }
            output = Math.max(output,newOut);
        }
        return output;
    }
}
