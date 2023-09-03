import java.util.*;
class Charreplace{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter first char.: ");
        char ch1=sc.next().charAt(0);
        System.out.println("Enter second char.: ");
        char ch2=sc.next().charAt(0);
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1)
                res+=ch2;
            else if(str.charAt(i)==ch2)
                res+=ch1;
            else 
                res+=str.charAt(i);
        }
        System.out.println("Result: "+res);
    }
}