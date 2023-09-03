import java.util.*;
class Kthlargest{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int k=sc.nextInt();
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        TreeSet<Integer> t=new TreeSet<>();
        for(int i=0;i<n;i++)
            t.add(arr[i]);
        int pos=0;
        while(pos!=k){
            pos++;
            t.pollLast();
        }
        System.out.println("Result: "+t.pollLast());
    }
}