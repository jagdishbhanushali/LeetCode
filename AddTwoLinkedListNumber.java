/**
 * Created by jagdi on 12/21/2016.
 */

 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class AddTwoLinkedListNumber {
    public static void main(String args[]){
        ListNode l11=new ListNode(2);
        ListNode l12=new ListNode(4);
        ListNode l13=new ListNode(9);
        l12.next=l13;
        l11.next=l12;

        ListNode l21=new ListNode(2);
        ListNode l22=new ListNode(4);
        ListNode l23=new ListNode(3);
        l21.next=l22;
        l22.next=l23;

        AddTwoLinkedListNumber a=new AddTwoLinkedListNumber();
        a.printLinkedList(l11);
        a.printLinkedList(l21);
        ListNode l3=a.addTwoNumbers(l11,l21);
        a.printLinkedList(l3);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int plusResult,carry=0;
        ListNode l3=new ListNode(0);
        ListNode head=l3;
        while(l1!=null && l2!=null){
            plusResult=l1.val+l2.val+carry;
            carry=plusResult/10;
            l3.val=plusResult%10;
            l1=l1.next;
            l2=l2.next;
            if(l1!=null || l2!=null || carry !=0  ){
                l3.next=new ListNode(0);
                l3=l3.next;
                if (l1==null){
                    l1=new ListNode(0);
                }

                if (l2==null)
                    l2=new ListNode(0);
            }
        }
        return head;
    }

    public void printLinkedList(ListNode l){
        while(l!=null){
            System.out.print(l.val);
            l=l.next;
            if(l!=null)
                System.out.print("->");
        }
        System.out.println();
    }
}
