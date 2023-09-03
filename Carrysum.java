import java.util.*;
class Carrysum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1: ");
        String num1=sc.nextLine();
        System.out.println("Enter the number2: ");
        String num2=sc.nextLine();
        int i=num1.length()-1,j=num2.length()-1,c=0,res=0;
        while(i>=0 && j>=0){
            int s=c+(int)(num1.charAt(i)-'0')+(int)(num2.charAt(j)-'0');
            if(s>9){
                res++;
                c=1;
            }
            else
                c=0;
            i--;
            j--;
        }
        while(i>=0){
            int s=c+(int)(num1.charAt(i)-'0');
            if(s>9){
                res++;
                c=1;
            }
            else
                c=0;
            i--;
        }
        while(j>=0){
            int s=c+(int)(num1.charAt(j)-'0');
            if(s>9){
                res++;
                c=1;
            }
            else
                c=0;
            j--;
        }
        System.out.println("Result= "+res);
    }
}