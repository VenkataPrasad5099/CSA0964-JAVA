import java.util.*;
    public class SampleCell {
        public static void main(String arg[]) {
            {
                List L = new LinkedList();
               for(int i=0;i<100;i++)
               {
                   L.add(i);
               }
               L.remove(1);
                System.out.println(L);
            }
        }
    }
