import java.util.Vector;

public class Program1 {
    public static void main(String[] arg){
        Vector V=new Vector();
        for(int i=0;i<6;i++)
        {
            V.add(i);
        }
        V.add(1);
        V.add("hi");
        V.remove(2);
        System.out.println(V);
    }}
