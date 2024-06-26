import java.util.*;

public class Program {
    public static void main(String arg[])

    {
        Stack S =new Stack();
        for(int i=0;i<6;i++)
        {
            S.push(i);
        }
        for(int i=0;i<=3;i++) {
            S.pop();
        }
        System.out.println(S);
    }
}
