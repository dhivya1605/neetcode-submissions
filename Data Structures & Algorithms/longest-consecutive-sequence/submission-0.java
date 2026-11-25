class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int l = 0;
        for(int i :nums){
            if(!s.contains(i-1)){
                int currnum  = i;
                int c = 1;
                while(s.contains(currnum+1)){
                    currnum++;
                    c++;
                }
                l = Math.max(l,c);

            }
        }
        return l;
    }
}
