import java.util.*;
class Matrixoperation1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int oddarr[]=new int[size/2];
        int evenarr[];
        if(size%2==0)
            evenarr=new int[size/2];
        else 
            evenarr=new int[size/2+1];
        int ei=0,oi=0;
        for(int i=0;i<size;i++){
            if(i%2==0)
                evenarr[ei++]=arr[i];
            else 
                oddarr[oi++]=arr[i];
        }
        Arrays.sort(evenarr);
        Arrays.sort(oddarr);
        int sum=oddarr[1]+evenarr[evenarr.length-2];
        System.out.println("Second smallest at odd pos= "+oddarr[1]);
        System.out.println("Second largest at even pos= "+evenarr[evenarr.length-2]);
        System.out.println("Result= "+sum);
    }
}