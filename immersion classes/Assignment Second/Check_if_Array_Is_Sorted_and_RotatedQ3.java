import java.util.*;

public class Check_if_Array_Is_Sorted_and_RotatedQ3 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        System.out.println(check(arr));

    }

    public static boolean check(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                c++;
            }
        }
        if (c == 0) {
            return true;
        } else if (c > 1) {
            return false;
        }
        if (nums[0] >= nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }

    }

}
