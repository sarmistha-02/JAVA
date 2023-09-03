import java.util.*;
class Div{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int m=sc.nextInt();
        System.out.println("Enter the end value: ");
        int n=sc.nextInt();
        int res=0;
        for(int i=m+1;i<n;i++){
            if((i%3==0) && (i%5==0)){
                res+=i;
            }
        }
        System.out.println("Result: "+res);
    }
}