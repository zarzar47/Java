public class ListArray {
    DLinkedList[] ListArr;

    public ListArray() {
        ListArr = new DLinkedList[26];
    }

    // O(1)
    public void Insert(String title, String year, MovieCast cast) {
        char c = title.charAt(0);
        int index = c - 65;
        if (ListArr[index] == null)
            ListArr[index] = new DLinkedList();
        ListArr[index].Insert(title, year, cast);
    }

    // O(N+N) = 0(2N) = O(N)
    public void Find(String title) {
        title = title.substring(0, 1).toUpperCase() + title.substring(1);
        char c = title.charAt(0);
        int index = c - 65;
        DLinkedList CharList = null;
        try {
            Node node = ListArr[index].Find(title);
            if (node != null) {
                System.out.println(node);
                return;
            }
            CharList = ListArr[index];
        } catch (NullPointerException e) {
            return;
        }
        Node curr_node = CharList.tail;
        while (curr_node != null) {
            if (curr_node.title.contains(title))
                System.out.println(curr_node);
            curr_node = curr_node.next;
        }
    }

    // O(N)
    public void Delete(String title) {
        char c = title.charAt(0);
        int index = c - 65;
        try {
            ListArr[index].Delete(title);
        } catch (NullPointerException e) {
            System.out.println("Category does not exist");
            return;
        }
    }

    // O(N*N) = O(N^2)
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < ListArr.length; i++) {
            if (ListArr[i] == null)
                continue;
            s = s + ((char) (i + 65)) + ":\n";
            s = s + ListArr[i] + "\n";
        }
        return s;
    }
}
