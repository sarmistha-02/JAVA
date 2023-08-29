import java.util.*;
class Straightline{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no. of points: ");
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        int i;
        for(i=0;i<n;i++){
            System.out.println("Enter x"+i+": ");
            arr[i][0]=sc.nextInt();
            System.out.println("Enter y"+i+": ");
            arr[i][1]=sc.nextInt();
        }
        int dy=arr[1][1]-arr[0][1],dx=arr[1][0]-arr[0][0],x1=arr[0][0],y1=arr[0][1];
        for(i=0;i<n;i++){
            int x=arr[i][0]-x1;
            int y=arr[i][1]-y1;
            if((dy*x)!=(dx*y))
                break;
        }
        if(i<n){
            System.out.println("Result=0");
            System.exit(0);
        }
        double m=(double)dy/(double)dx;
        double b=(double)y1-(m*(double)x1);
        System.out.println("Equation:\ny="+m+"x+"+b);
    }
}