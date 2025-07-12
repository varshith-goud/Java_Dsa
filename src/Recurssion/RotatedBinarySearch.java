package Recurssion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3,4};
        System.out.println(binary(arr,4,0, arr.length-1));
    }

    static int binary(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        // Left half is sorted
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return binary(arr, target, s, m - 1);
            } else {
                return binary(arr, target, m + 1, e); }
        }

        // Right half is sorted
        if (arr[m] <= arr[e]) {
            if (target >= arr[m] && target <= arr[e]) {
                return binary(arr, target, m + 1, e);
            } else {
                return binary(arr, target, s, m - 1);
            }
        }

        return -1;
    }

}
