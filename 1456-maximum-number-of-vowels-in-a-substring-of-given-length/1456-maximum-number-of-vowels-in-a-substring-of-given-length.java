
class Solution {
    boolean isVowel(char ch){
    return "aeiou".indexOf(ch)!=-1;
}
    public int maxVowels(String s, int k) {
        
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int max=count;
        for(int r=k;r<s.length();r++){
            if(isVowel(s.charAt(r))){
                count++;
            }
            if(isVowel(s.charAt(r-k))){
                count--;
            }
            max=Math.max(max,count);

        }
    return max;    
        
    }
}