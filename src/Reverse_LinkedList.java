import java.util.Scanner;

class Node{
    int data;
    Node reverse;
    Node next;
}


public class Reverse_LinkedList {
    public static  Node head,tail;
    public static  void Insert(int val)
    {
        Node ob = new Node();
        ob.data = val;

        if(head == null)
        {
            head = ob;
            tail = ob;
        }
        else{
            ob.reverse = tail;
            tail.next = ob;
            tail = ob;
            //Node temp =
        }
    }



    public static void ReversePrint()
    {
        Node temp = tail;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.reverse;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0) {

            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Insert(sc.nextInt());
            }
            ReversePrint();
        }
    }
}
