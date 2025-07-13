package mazeproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class pathprint {
    public static void main(String[] args) {
        boolean maze [][]={
                {true,true,true},
                {true,true,true},
                {true,true,true},

        };
        int [][]path=new int[maze.length][maze[0].length];

        allpaths("",maze,0,0,path,1);
    }
    static void allpaths(String p, boolean[][] maze , int r, int c,int[][] path,int step){
        if(r== maze.length-1 && c == maze[0].length-1){
            path[r][c]=step;
            for(int[] num:path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println(step);
        }

        if(!maze[r][c]){
            return ;
        }
        maze[r][c] = false;
        path[r][c]=step;
        if(r< maze.length-1){
            allpaths(p+'d',maze,r+1,c,path,step+1);
        }
        if(c< maze[0].length-1){
           allpaths(p+'r',maze,r,c+1,path,step+1);
        }
        if(r>0){
            allpaths(p+'u',maze,r-1,c,path,step+1);
        }
        if(c>0){
            allpaths(p+'l',maze,r,c-1,path,step+1);
        }
        maze[r][c]= true;
        path[r][c]=0;

    }
}
