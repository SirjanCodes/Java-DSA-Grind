class Solution {
    public String defangIPaddr(String address) {
        String ans=""; /*same like arrays, return type means use logic using new String or something*/
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){ //very basic nd simple logic, dont overcomplicate
                ans=ans+"[.]";
            }
            else{ 
                ans=ans+address.charAt(i); //no silly mistake, dont forget this
            }
        }
        return ans;
    }
}
//can be solved using StringBuilder too, using append to add the required info.
