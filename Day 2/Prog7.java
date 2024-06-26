public class  Prog7{
    public static void main(String[] args) {

        int [] arr = new int [] {105, 11, 7, 75, 56};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    for(int i=0;i<5;i++)
    {
        int r=max-arr[i];
        System.out.println(r);
    }
    }
}
