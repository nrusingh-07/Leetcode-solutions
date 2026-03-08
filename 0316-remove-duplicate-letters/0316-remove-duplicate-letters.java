class Solution {
    public String removeDuplicateLetters(String s) {
        String res = "";
    
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
        if(res.indexOf(ch) != -1)
        continue;
        while(res.length() > 0 && 
        res.charAt(res.length() -1) > ch &&
        s.indexOf(res.charAt(res.length() - 1), i) != -1){
           res =  res.substring(0, res.length() -1);
        }
             res = res + ch;
        }
        return res;
        
       
}
}