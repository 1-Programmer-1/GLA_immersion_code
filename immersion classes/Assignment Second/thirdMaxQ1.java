import java.util.*;

public class thirdMaxQ1 {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c = 0;
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != max && c < 3) {
                max = nums[i];
                c++;

            }

        }
        if (c >= 3) {
            return max;
        }
        return nums[nums.length - 1];

    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1 };
        thirdMax(arr);

    }

}
