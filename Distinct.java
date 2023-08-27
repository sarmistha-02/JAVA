import java.util.*;
class Distinct{
    public int findCount(int arr[],int length){
        TreeSet<Integer> t=new TreeSet<Integer>();
        for(int i=0;i<length;i++)
            t.add(arr[i]);
        return t.size();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        Distinct obj=new Distinct();
        int res=obj.findCount(arr,size);
        System.out.println("Result= "+res);
    }
}