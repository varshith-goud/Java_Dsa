package Recurssion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] ={3,5,6,4,4,7,9,11};
        System.out.println(find(arr,11,0));
        findocc(arr,4,0);
        System.out.println(ls);
    }

    static int find (int []arr,int target,int i){
     if(i == arr.length){
         return -1;
     }
     if(arr[i]==target){
         return i;
     }
     return find(arr,target,i+1);
    }

    static ArrayList <Integer> ls =new ArrayList<>();
    static void findocc (int []arr,int target,int i){
        if(i == arr.length){
            return ;
        }
        if(arr[i]==target){
            ls.add(i);
        }
         findocc(arr,target,i+1);
    }
}
