import java.util.*;
class Minproduct{
    public int productSmalPair(int sum, int[] arr){
        if(arr.length<2)
            return -1;
        Arrays.sort(arr);
        int s=arr[0]+arr[1];
        if(s<sum)
            return (arr[0]*arr[1]);
        else
            return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the sum: ");
        int sum=sc.nextInt();
        Minproduct obj=new Minproduct();
        int res=obj.productSmalPair(sum,arr);
        System.out.println("Result= "+res);
    }
}