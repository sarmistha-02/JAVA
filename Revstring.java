import java.util.*;
class Revstring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the statement: ");
        String s=sc.nextLine();
        s=s+" ";
        String res="";
        int i,p=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                res=" "+s.substring(p,i)+res;
                p=i+1;
            }
        }
        System.out.println(res.substring(1));
    }
}