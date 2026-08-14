class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String,ArrayList<String>> h = new HashMap<>();
         for(String s : strs){
            int ct[] = new int[26];
            for(char c : s.toCharArray()){
                ct[c-'a']++;

            }
            String key = Arrays.toString(ct);
         
         h.computeIfAbsent(key,k->new ArrayList<>()).add(s);
         }
         return new ArrayList<>(h.values());

    }
}
