class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String str:strs){

            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String x = Arrays.toString(arr);

            if (!map.containsKey(x)) {
                map.put(x, new ArrayList<>());
                map.get(x).add(str);    
            }else{
                map.get(x).add(str);
            }

        }

        return new ArrayList<>(map.values());
    }
}
