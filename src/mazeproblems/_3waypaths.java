package mazeproblems;

import java.util.ArrayList;

public class _3waypaths {
    public static void main(String[] args) {
        System.out.println(pathdiagonal("",3,3));
    }
    static ArrayList<String> pathdiagonal(String p , int r, int c){
        if(r==1 && c==1 ){
            ArrayList <String> ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList <String> ls=new ArrayList<>();
        if(r>1 && c>1){
           ls.addAll( pathdiagonal(p+'d',r-1,c-1));
        }
        if(r>1){
            ls.addAll(  pathdiagonal(p+'v',r-1,c));
        }
        if(c>1){
            ls.addAll(  pathdiagonal(p+'h',r,c-1));
        }
         return ls;
    }
}
