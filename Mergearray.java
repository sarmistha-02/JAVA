import java.util.*;
class Mergearray{
    public int[] merge(int ar1[],int ar2[],int m,int n){
        int res[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(ar1[i]<ar2[j])
                res[k++]=ar1[i++];
            else
                res[k++]=ar2[j++];
        }
        while(i<m)
            res[k++]=ar1[i++];
        while(j<n)
            res[k++]=ar2[j++];
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array: ");
        int m=sc.nextInt();
        int ar1[]=new int[m];
        System.out.println("Enter the elements in sorted manner: ");
        for(int i=0;i<m;i++)
            ar1[i]=sc.nextInt();
        System.out.println("Enter the size of 2nd array: ");
        int n=sc.nextInt();
        int ar2[]=new int[n];
        System.out.println("Enter the elements in sorted manner: ");
        for(int i=0;i<n;i++)
            ar2[i]=sc.nextInt();
        Mergearray obj=new Mergearray();
        int res[]=obj.merge(ar1,ar2,m,n);
        System.out.println("Result:");
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
}