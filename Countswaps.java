import java.util.*;
class Countswaps{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int c=0;
        for(int i=0;i<size-1;i++){
            int index=i;
            for(int j=i+1;j<size;j++){
                if(arr[index]>arr[j])
                    index=j;
            }
            if(i!=index){
                c++;
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("Result= "+c);
    }
}