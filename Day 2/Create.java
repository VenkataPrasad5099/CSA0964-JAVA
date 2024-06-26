import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.LinkedList;

public class Create {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("silent");
        l.add("dam") ;
        l.add("sad");
        l.add("read");
//        Collections.reverseOrder();
//        Collections.sort(l);
//        Collections.rotate(l,1);
        Collections.shuffle(l);
        System.out.println(l);
    }
}
