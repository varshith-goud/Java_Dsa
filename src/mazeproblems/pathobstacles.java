package mazeproblems;

import java.util.ArrayList;

public class pathobstacles {
    public static void main(String[] args) {
         boolean maze [][]={
                 {true,true,true,true},
                 {true,false,true,true},
                 {true,false,true,true},
                 {true,true,true,true}
         };
        System.out.println(pathsres("",maze,0,0));
    }
    static ArrayList<String> pathsres(String p, boolean [][] maze , int r, int c){
        if(r== maze.length-1  && c== maze[0].length-1 ){
            ArrayList<String> ls =new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> ls =new ArrayList<>();
        if(!maze[r][c]){
            return ls;
        }

return ls;
    }
}
