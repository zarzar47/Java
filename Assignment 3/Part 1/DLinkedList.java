public class DLinkedList implements DList {
    Node head;
    Node tail;


    // O(1)
    public void Insert(String title, String year, MovieCast list){
        Node node =new Node(title,year,list);
        if (isEmpty()){
            head=node;
            tail=head;
            return;
        }

        head.next=node;
        node.prev=head;
        head=node;
    }

    // O(N)
    public void Delete(String title){
        Node del_node=Find(title);
        if (del_node==null)
            return;
        del_node.prev.next=del_node.next;
        del_node.next.prev=del_node.prev;
    }

    // O(N)
    public Node Find(String title){
        Node curr_node=tail;
        while(curr_node!=null){
            if (curr_node.title.equalsIgnoreCase(title))
                break;
            curr_node=curr_node.next;
        }
        return curr_node;
    }

    // O(N)
    @Override
    public String toString() {
        Node curr_node=tail;
        String s="";
        while(curr_node!=null){
            s=s+curr_node.title+"\n";
            curr_node=curr_node.next;
        }
        return s;
    }

    // O(1)
    public boolean isEmpty(){
        return head==null;
    }
}
