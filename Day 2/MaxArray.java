public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {231, 12, 3, 24, 5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <arr[i]) {
                max = arr[i];
            }
        }
            System.out.println(max);

    }
}


