class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] paraWords = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<paraWords.length; i++){
            if(!map.containsKey(paraWords[i])){
                map.put(paraWords[i], 1);
            }else{
                map.put(paraWords[i], map.get(paraWords[i])+1);
            }
        }
               
        for(String ban : banned){
            map.remove(ban);
        }
        int maxCnt = 0;
        String result = ""; 
        for(String key : map.keySet()){
            if(maxCnt < map.get(key)){
                maxCnt = map.get(key);
                result = key;
            }
        }
        return result;
    }
}