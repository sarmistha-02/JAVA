import java.util.*;
class Coindonation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day: ");
        int n=sc.nextInt();
        int res=0;
        for(int i=1;i<=n;i++)
            res+=(i*i);
        System.out.println("Result= "+res);
    }
}