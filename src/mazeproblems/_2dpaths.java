package mazeproblems;

public class _2dpaths {
    public static void main(String[] args) {
        System.out.println(paths(3,3));
        pathsprint("",3,3);
    }
    static int paths(int r,int c){
        if(r==1 || c==1 ){
            return 1;
        }
        int left=paths(r-1,c);
        int right=paths(r,c-1);

        return left+right;
    }

    static void pathsprint(String p ,int r,int c){
        if(r==1 && c==1 ){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathsprint(p+'d',r-1,c);
        }
        if(c>1){
            pathsprint(p+'r',r,c-1);
        }

    }
}
