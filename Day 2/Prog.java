import java.util.*;
public class Prog {
    public static void main(String[] arg)
    {
        List<Integer> L= new ArrayList<Integer>();
        for(int i=0;i<100;i++)
        {
            L.add(i);

        }
        L.remove(1);
        System.out.println(L);
    }
}
