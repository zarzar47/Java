public class DoublyLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public void InsertInorder(T value) {
        Node<T> new_node=new Node<>(value);
        if (head==null){
            new_node.next=null;
            new_node.prev=null;
            head=new_node;
            return;
        }

        if (head.data.compareTo(new_node.data)==1){
            new_node.prev=null;
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
            return;
        }

        Node<T> curr=head;

        while(!(curr.next==null)){
            curr=curr.next;
            if (curr.data.compareTo(new_node.data)==1){//0 means equal, 1 means a>b and -1 means a<b
                new_node.next=curr;
                new_node.prev=curr.prev;
                curr.prev=new_node;
                new_node.prev.next=new_node;
                return;
            }
        }
        curr.next=new_node;
        new_node.prev=curr;
    }

    public Node<T> Find(T value) {
        Node<T> curr=head;
        while(curr!=null){
            if (curr.data.compareTo(value)==0)
                return curr;
            curr=curr.next;
        }
        return curr;
    }

    public void Delete(T value) {
        if (Find(value)==null){
            System.out.println("No such value found");
            return;
        }

        Node<T> curr=head;
        while(!(curr.next==null)){
            if (curr.data.compareTo(value)==0){//0 means equal, 1 means a>b and -1 means a<b
                curr.prev.next=curr.next;
                curr.next.prev=curr.prev;
                break;
            }
            curr=curr.next;
        }

    }

    public String toString(){
        Node<T> curr=head;
        String s="";
        while(curr!=null){
            s=s+curr.data+" ";
            curr=curr.next;
        }
        return s;
    }

    public void clearList(){
        head=null;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int Length(){
        int count=0;
        Node<T> curr=head;

        while (curr!=null){
            count++;
            curr=curr.next;
        }

        return count;
    }

    public void Reverselist() {
        Node<T> curr=head;
        while (curr.next!=null){
            Node<T> old_prev=curr.prev;
            curr.prev=curr.next;
            curr.next=old_prev;
            curr=curr.prev;
        }
        curr.next=curr.prev;
        curr.prev=null;
        head=curr;
    }
}
