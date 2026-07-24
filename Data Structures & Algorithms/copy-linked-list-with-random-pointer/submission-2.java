/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        {
            return head;
        }
        HashMap<Node,Node> map=new HashMap<>();
        Node newhead=new Node(head.val);
        Node oldtemp=head.next;
        Node newtemp=newhead;
        map.put(head,newhead);
       // Copy old linkedList to New LinkedList
        while(oldtemp!=null)
        {
            Node copy=new Node(oldtemp.val);
            newtemp.next=copy;
            map.put(oldtemp,copy);
            oldtemp=oldtemp.next;
            newtemp=newtemp.next;
        }
        //Reintialize the newtemp and oldtemp;
        oldtemp=head;
        newtemp=newhead;
        //Copy LinkedList with random pointer
        while(oldtemp!=null)
        {
            newtemp.random=map.get(oldtemp.random);
            oldtemp=oldtemp.next;
            newtemp=newtemp.next;

        }
        return newhead;
    }
}
