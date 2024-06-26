public class Prog1 {
    public static void main(String[] arg)
    {

        try
        {
//            int a=10;
//            int b=0;
//            int c=a/b;
            System.out.println(Math.tan(Math.toRadians(90)));
            System.out.println(Math.pow(0,0));
            System.out.println(Math.log(0));
//            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
