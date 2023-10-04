public class Node {
    Node next;
    Node prev;
    MovieCast cast;
    String title;
    String year;


    public Node(String t, String y,MovieCast e){
        this.cast=e;
        this.title=t;
        this.year=y;
    }

    public Node(String name){
        this.title=name;
    }

    @Override
    public String toString() {
        return title+", year: "+year+", cast: "+cast;
    }
}
