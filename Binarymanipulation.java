import java.util.*;
class Binarymanipulation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        int a=0;
        if(str.charAt(0)=='1')
            a=1;
        if(str.length()==0){
            System.out.println("-1");
            System.exit(0);
        }
        for(int i=2;i<str.length();i=i+2){
            if(str.charAt(i-1)=='C'){
                if(str.charAt(i)=='I')
                    a=a^1;
                else 
                    a=a^0;
            }   
            else if(str.charAt(i-1)=='A'){
                if(str.charAt(i)=='I')
                    a=a&1;
                else 
                    a=a&0;
            }
            else if(str.charAt(i-1)=='B'){
                if(str.charAt(i)=='I')
                    a=a|1;
                else 
                    a=a|0;
            }
        }
        System.out.println("Result= "+a);
    }
}