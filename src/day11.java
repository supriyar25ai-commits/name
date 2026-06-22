import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class day11 {
    /*
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        set.add("student 2");
        set.add("student 1");
        set.add("student 2");
        for (String s : set)
            System.out.println(s);
    }
}


     */
    /*
    Map<String, Integer> person = new HashMap<>();
     person.put("ram",89);
        person.put("john",78);
        person.put("Aravindh",67.7);
        person.put("Ramesh",90);

        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry ->{
        System.out.println(entry.getKey() + " : " + entry.getValue());
    });
}

}

     */
    static void main() {

        Map<String, Integer> person = new HashMap<>();
        person.put("Ram", 89);
        person.put("john", 78);
        person.put("Aravindh", 67);
        person.put("ramesh", 90);
        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}

