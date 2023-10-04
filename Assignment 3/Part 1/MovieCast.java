public class MovieCast implements DList{
    public void add(String name){
        Insert(name,"",null);
    }

    @Override
    public String toString() {
        Node curr_node=tail;
        String s="";
        while(curr_node.next!=null){
            s=s+curr_node.title+" -> ";
            curr_node=curr_node.next;
        }
        return s+curr_node.title;
    }
}
