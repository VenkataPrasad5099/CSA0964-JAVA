public class Greater {
    public static void main(String[] args) {
        int n1=5;
        int n2=20;
        int n3=15;
        int n4;
        n4=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println(n4);
    }
}
