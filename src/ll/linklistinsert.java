package ll;

public class linklistinsert {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7};
        linklist head=convert(arr);
        linklist var=head;
        while (var!=null){
            System.out.println(var.data+" ");
            var=var.next;
        }

        System.out.println(head.data);
    }

    static linklist convert(int []arr){
        linklist head=new linklist(arr[0]);
        linklist mover=head;
        for(int i=1;i< arr.length;i++){
            linklist temp=new linklist(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;
    }
}
