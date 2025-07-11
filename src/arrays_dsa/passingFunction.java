package arrays_dsa;

import java.util.Arrays;

public class passingFunction {
    public static void main(String[] args) {
        int [] nums ={11,24,15,13,07};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString((nums)));
    }

     static void change(int[] nums) {
        nums[0]=12;
    }
}
