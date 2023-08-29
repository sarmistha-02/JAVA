import java.util.*;
import java.math.*;
class Stringlen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        BigInteger n=new BigInteger(s);
        BigInteger div=new BigInteger("11");
        BigInteger res=n.mod(div);
        System.out.println("Result= "+res);
    }
}