class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch='a';ch<='z';ch++){ //traversing through each character
            if(sentence.indexOf(ch)==-1){ //logic and remember syntax:-indexOf just like charAt
                return false;
            }
        }
        return true;
    }
}
