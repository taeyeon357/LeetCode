class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letter = new ArrayList<>();
        List<String> digit = new ArrayList<>();
        String[] result = new String[logs.length];
        
        for(int i=0; i<logs.length; i++){
            String[] tmp = logs[i].split(" ",2);
            if(Character.isDigit(tmp[1].charAt(0))){
                digit.add(logs[i]);
            }else{
                letter.add(logs[i]);
            }
        }
        
        Collections.sort(letter, (s1, s2) ->{
            String[] a = s1.split(" ", 2);
            String[] b = s2.split(" ", 2);
            int cmp = a[1].compareTo(b[1]);
            if(cmp == 0){
                return a[0].compareTo(b[0]);
            }else{
                return cmp;
            }
        });
        
        for(int i=0; i<letter.size(); i++){
            result[i] = letter.get(i);
        }
        
        for(int i=0; i<digit.size(); i++){
            result[letter.size()+i] = digit.get(i);
        }
        
        return result;
    }
}