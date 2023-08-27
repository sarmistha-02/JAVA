import java.util.*;
class Passwordvalidator{
    public int CheckPassword(String s,int n){
        int i;
        if(n<=3)
            return 0;
        for(i=0;i<n;i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                break;
        }
        if(i==n)
            return 0;
        for(i=0;i<n;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                break;
        }
        if(i==n)
            return 0;
        for(i=0;i<n;i++){
            if(s.charAt(i)==' ' || s.charAt(i)=='/')
                break;
        }
        if(i<n)
            return 0;
        if(s.charAt(0)>='0' && s.charAt(0)<='9')
            return 0;
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        Passwordvalidator obj=new Passwordvalidator();
        int res=obj.CheckPassword(s,s.length());
        System.out.println("Result= "+res);
    }
}