import java.util.*;

public class Sample {

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        {list.add("apple");
            list.add("orange");
            list.add("apple");
            list.add("mango");
            list.add("orange");
            System.out.println(list);
            Set<String> set = new LinkedHashSet<String>(list);
            System.out.println(set);
        }
    }
}
