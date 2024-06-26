public class Prog14 {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]+" ");
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }
}
