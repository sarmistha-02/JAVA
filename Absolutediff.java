import java.util.*;
class Absolutediff{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Enter the difference: ");
        int diff=sc.nextInt();
        int res=0;
        for(int i=0;i<size;i++){
            if((int)Math.abs((arr[i]-num))<=diff)
                res++;
        }
        System.out.println("Result: "+res);
    }
}