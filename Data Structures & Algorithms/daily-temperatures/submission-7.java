class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;

        ArrayList<Integer> lst = new ArrayList<>();
    
        for(int i = 0;i<n;i++){
            int curr = temperatures[i];

            Stack<Integer> temp = new Stack<>();

            for(int j = n-1;j > i ;j--){
                temp.push(temperatures[j]);
            }

            int ct = 1;
            
            while(!temp.isEmpty() && curr >= temp.peek()){
                temp.pop();
                ct++;
            }
            if (temp.isEmpty()) ct = 0;
            lst.add(ct);

        }

        int res[] = new int[n];

        for(int i = 0;i<lst.size();i++){
            res[i] = lst.get(i);
        }

        return res;

    }
}
