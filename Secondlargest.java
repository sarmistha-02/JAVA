import java.util.*;
class Secondlargest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int temp=arr[arr.length-1],res=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=temp){
                res=arr[i];
                break;
            }
        }
        System.out.println("Result= "+res);
    }
}