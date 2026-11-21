class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<strs.size();i++){
            s.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return s.toString();

    }

    public List<String> decode(String str) {
        List<String> s = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+len);
            s.add(word);
            i = j+1+len;
        }
        return s;

    }
}
