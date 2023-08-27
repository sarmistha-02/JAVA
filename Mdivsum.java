import java.util.*;
class Mdivsum{
    public int differenceofSum(int n, int m){
        int mdiv=0,mndiv=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0)
                mndiv+=i;
            else 
                mdiv+=i;
        }
        System.out.println("Total of nos. not divisible by "+m+" are= "+mndiv);
        return (mndiv-mdiv);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m: ");
        int m=sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        Mdivsum obj=new Mdivsum();
        int res=obj.differenceofSum(n,m);
        System.out.println("Result= "+res);
    }
}