package mazeproblems;

import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {
        boolean maze [][]={
                {true,true,true},
                {true,true,true},
                {true,true,true},

        };
        System.out.println(allpaths("",maze,0,0));
    }
    static ArrayList<String> allpaths(String p,boolean[][] maze ,int r,int c){
        if(r== maze.length-1 && c == maze[0].length-1){
            ArrayList<String> ls =new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> ls =new ArrayList<>();
        if(!maze[r][c]){
            return ls;
        }
         maze[r][c] = false;
        if(r< maze.length-1){
            ls.addAll(allpaths(p+'d',maze,r+1,c));
        }
        if(c< maze[0].length-1){
            ls.addAll( allpaths(p+'r',maze,r,c+1));
        }
        if(r>0){
            ls.addAll(allpaths(p+'u',maze,r-1,c));
        }
        if(c>0){
            ls.addAll(allpaths(p+'l',maze,r,c-1));
        }
        maze[r][c]= true;
        return ls;
    }
}
