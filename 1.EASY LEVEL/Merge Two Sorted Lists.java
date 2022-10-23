QUESTION LINK - https://leetcode.com/problems/merge-two-sorted-lists/
  
======================================================================ANSWER===========================================================================================


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1 == null)   return list2;
        if(list2 == null)   return list1;
        if(list1 == null && list2 == null) return null;
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode newHead = null;
        ListNode newTail = null;
        
        //deciding head
        if(temp1.val <= temp2.val){
            newHead = temp1;
            newTail = temp1;
            temp1 = temp1.next;
        }
        else{
            newHead = temp2;
            newTail = temp2;
            temp2 = temp2.next;
        }
        
        while(temp1 != null && temp2 != null){
            
            if(temp1.val <= temp2.val){
                newTail.next = temp1;
                newTail = newTail.next;
                temp1 = temp1.next;
            }
            
            else{
                newTail.next = temp2;
                newTail = newTail.next;
                temp2 = temp2.next;
            }
        }
        
        while(temp1 != null){
            newTail.next = temp1;
            newTail = newTail.next;
            temp1 = temp1.next;
        }
        
        while(temp2 != null){
            newTail.next = temp2;
            newTail = newTail.next;
            temp2 = temp2.next;
        }
        
        return newHead;
    }
}
