public class MovieCast implements DList{
    Node tail;
    Node head;

    // O(1)
    public void Insert(String title) {
        Node node =new Node(title,null,null);
        if (head==null){
            head=node;
            tail=head;
            return;
        }

        head.next=node;
        node.prev=head;
        head=node;
    }

    // O(N)
    public String toString() {
        Node curr_node=tail;
        String s="";
        while(curr_node.next!=null){
            s=s+curr_node.title+" - ";
            curr_node=curr_node.next;
        }
        return s+curr_node.title;
    }
}
