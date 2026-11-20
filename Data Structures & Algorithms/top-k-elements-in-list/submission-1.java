class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> a = new ArrayList<>(h.keySet());
        a.sort((x,y)->h.get(y)-h.get(x));

        int s[] = new int[k];
       
        for(int i =0;i<k;i++){
           s[i] = a.get(i);
        }
        return s;

    }
}
