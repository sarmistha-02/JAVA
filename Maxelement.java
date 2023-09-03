import java.util.*;
class Maxelement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int max=arr[0],pos=0;
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
                pos=i;
            }
        }
        System.out.println("Max. element: "+max);
        System.out.println("Index: "+pos);
    }
}