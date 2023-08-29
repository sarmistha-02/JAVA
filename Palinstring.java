import java.util.*;
class Palinstring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                break;
            i++;
            j--;
        }
        if(i<j)
            System.out.println("0");
        else 
        System.out.println("1");
    }
}