import java.util.ArrayList;
public class day10 {
    public static void main(){
        ArrayList<String> students = new ArrayList<>();
        students.add("kumar");
        students.add("devil");
        students.add("Kavin");
        students.add("Ram");
        students.add("Arun");
        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
        students.remove("Ram");
        System.out.println("\nAfter Removing Ram:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}