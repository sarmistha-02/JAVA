import java.util.*;
class Sumofdivisors{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int res=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                res+=i;
        }
        System.out.println("Result= "+res);
    }
}