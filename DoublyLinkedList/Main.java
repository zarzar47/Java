
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Student> List=new DoublyLinkedList<>();
        
        List.InsertInorder(new Student(19));
        List.InsertInorder(new Student(2));
        List.InsertInorder(new Student(51));
        List.InsertInorder(new Student(20));
        List.InsertInorder(new Student(30));
        List.InsertInorder(new Student(1));
        List.InsertInorder(new Student(18));
        List.InsertInorder(new Student(22));
        List.InsertInorder(new Student(99));
        System.out.println("Original: ");
        System.out.println(List);
        System.out.println(List.Length());
        List.Delete(new Student(30));
        List.Delete(new Student(51));
        List.Delete(new Student(20));
        System.out.println("Deleted: ");
        System.out.println(List);
        System.out.println(List.Length());
        List.Reverselist();
        System.out.println();
        System.out.println(List);
        // List.clearList();
        // System.out.println("Empty: ");
        // System.out.println(List);
        // System.out.println(List.Length());
    }
}

class Student implements Comparable<Student> {
        int ID;
        Student(int ID){
            this.ID=ID;
        }
    
        @Override
        public int compareTo(Student student) {
            if (this.ID>student.ID)
                return 1;
            else if (this.ID<student.ID)
                return -1;
            return 0;
        }
    
        @Override
        public String toString() {
            return ""+ID;
        }
    }
