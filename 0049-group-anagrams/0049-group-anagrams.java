class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String tmpS = new String(tmp);
            if(map.containsKey(tmpS)){
                List<String> list = map.get(tmpS);
                list.add(strs[i]);
                map.put(tmpS, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(tmpS, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}