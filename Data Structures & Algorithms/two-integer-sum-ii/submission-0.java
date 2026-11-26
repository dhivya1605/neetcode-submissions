class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int res[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            int a = target - nums[i];
            if(h.containsKey(a)){
                res[1] = i+1;
                res[0] = h.get(a)+1;
                return res;
            }
            else{
                h.put(nums[i],i);
            }
        }
        return res;
    }
}
