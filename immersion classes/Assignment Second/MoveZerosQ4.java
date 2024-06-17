import java.util.Arrays;

public class MoveZerosQ4 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        System.out.println(Arrays.toString(moveZeroes(arr)));
        
    }

    public static int[] moveZeroes(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                int temp = arr[i];
                for (int j = i; j < arr.length - 1; j++) {

                    arr[j] = arr[j + 1];

                }
                arr[arr.length - 1] = temp;

            }

        }
        return arr;

    }
}
