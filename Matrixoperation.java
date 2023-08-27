import java.util.*;
class Matrixoperation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the matrix: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int oddarr[]=new int[size/2];
        int evenarr[];
        if(size<=3){
            System.out.println("Number of elements less than 3, so can't access second last elements of sub-matrices.");
            System.exit(0);
        }
        if(size%2==0)
            evenarr=new int[size/2];
        else
            evenarr=new int[size/2+1];
        int ei=0,oi=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                evenarr[ei++]=arr[i];
            else 
                oddarr[oi++]=arr[i];
        }
        Arrays.sort(evenarr);
        Arrays.sort(oddarr);
        int res=evenarr[evenarr.length-2]+oddarr[oddarr.length-2];
        System.out.println("Result= "+res);
    }
}