QUESTION LINK - https://leetcode.com/problems/plus-one/
  
======================================================================ANSWER===========================================================================================
  
class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            
            /*if the digit is less than 9 then just add 1 to it
            /if the entire loop ends it means there was no digit more than 9
            then we will return the entire array as it is by adding 1 to each element;
            */
            
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            
            //if the ith digit is = 9 then make it 0
            digits[i] = 0;
        }
        
        //in case we need to increase the size of array by 1
        digits = new int[digits.length+1];
        
        //make the new first element of the digit as 1
        digits[0] = 1;
        
        //now return the array
        return digits;
    }
}
