QUESTION LINK - https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
EXPLANATION LINK - https://www.youtube.com/watch?v=Fm_p9lJ4Z_8
APPROACH - 1. Brute force - Using a set data structure
           2. In place swapping of elements
  
======================================================================ANSWER===========================================================================================
  
class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> s = new TreeSet<Integer>();
        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }
        
        int ans = s.size();
        
        int j=0;
        for(int n : s){
            nums[j++] = n;
        }
        
        return ans;
    }
}


-------------------------------------------------------------OPTIMIZED APPRAOCH---------------------------------------------------------------------------------------
  


  
