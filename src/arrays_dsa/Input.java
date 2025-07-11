package arrays_dsa;

import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        int [] arr =new int[5];
        for(int i =0;i<5;i++){
            arr[i]=i;
        }
//        for(int i =0;i<5;i++){
//            System.out.print(arr[i]+ " ");
//        }
//        for (int l :arr){
//            System.out.println(l +" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
