
class LRUCache {

    class Node {
        int val,key;
        Node prev;
        Node next;

        public Node(int key,int val) {
            this.val = val;
            this.key = key;
            this.next = null;
            this.prev = null;
        }
    };
    Node head=new Node(-1,-1);// Dummy Pointers
    Node tail=new Node(-1,-1);// Dummy Pointers
    HashMap<Integer,Node> map=new HashMap<>();
    int limit;

    void addnode(Node newnode)
    {
        Node oldnext=head.next;
        head.next=newnode;
        oldnext.prev=newnode;
        newnode.next=oldnext;
        newnode.prev=head;
    }
    void delnode(Node oldnode)
    {
        Node oldprev=oldnode.prev;
        Node oldnext=oldnode.next;
        oldprev.next=oldnext;
        oldnext.prev=oldprev;
    }
    public LRUCache(int capacity) {
        limit=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node ansnode = map.get(key);

        // Move the node to the head (Most Recently Used position)
        // No map.remove() or map.put() needed!
        delnode(ansnode);
        addnode(ansnode);

        return ansnode.val;

            }
    
    public void put(int key, int value) {
        if(map.containsKey(key))//If key is already present
        {
            Node oldnode=map.get(key);
            delnode(oldnode);
            map.remove(key);
        }
        if(map.size()==limit)
        {
            map.remove(tail.prev.key);
            delnode(tail.prev);
            
        }
        Node newnode=new Node(key,value);
        addnode(newnode);
        map.put(key,newnode);

    }
}
