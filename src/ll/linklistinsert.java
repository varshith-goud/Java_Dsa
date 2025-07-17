package ll;

public class linklistinsert {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7};
        linklist head=convert(arr);
        linklist var=head;
        int count=0;
        while (var!=null){
            System.out.print(var.data+" ");
            count++;
            var=var.next;
        }
        System.out.println();
        System.out.println(count);
        System.out.println(present(head,5));


    }

    static boolean present(linklist head,int val){
        linklist temp=head;
        while (temp!=null){
            if(temp.data == val){
                return true;
            }
            temp=temp.next;
        }
        return false;
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
