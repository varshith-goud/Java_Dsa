package ll;

public class linklist {

    int data;
    linklist next;

    linklist(int data,linklist next){
        this.data=data;
        this.next=next;
    }

    linklist(int data){
        this.data=data;
        this.next=null;
    }

}
