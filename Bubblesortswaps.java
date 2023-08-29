import java.util.*;
class Bubblesortswaps{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    c++;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Result= "+c);
    }
}