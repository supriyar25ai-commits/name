import java.util.linkedlist;
public class day11 {
    public static void main(String[] args) {
        LinkedList<String> set = new LinkedList<String>();
        set.add("student1");
        set.add("");
        set.add("kiran");
        set.add("bharanii");
        set.add("ram");
        set.add("student 1");
        set.add("student 2");
        for (String s : set)
            System.out.println(s);
    }
}