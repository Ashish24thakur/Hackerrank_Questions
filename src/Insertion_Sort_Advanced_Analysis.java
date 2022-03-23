import java.util.ArrayList;
import java.util.Scanner;

public class Insertion_Sort_Advanced_Analysis {

    public int InsertionSort(int arr[]) {
        int sum=0;
        for(int i=1;i<arr.length;i++)
        {
            int val = arr[i];
            int pos = i-1;

            while(pos>=0 && val<arr[pos])
            {
                sum = sum +1;
                //arr.add((pos+1),arr.get(pos));
                arr[pos+1] = arr[pos];
                pos = pos - 1;
            }
            arr[pos+1] = val;
        }
        //System.out.println("Hello");
        return sum;
    }

    public static void main(String[] args) {

        //ArrayList<Integer> data = new ArrayList<>();

        Insertion_Sort_Advanced_Analysis ob = new Insertion_Sort_Advanced_Analysis();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            //System.out.println("hii : ");
            int x = sc.nextInt();
            //data.add(x);
            arr[i] = x;
        }
        System.out.println(ob.InsertionSort(arr));
    }
}
