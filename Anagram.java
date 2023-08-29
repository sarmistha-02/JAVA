import java.util.*;
class Anagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String f=sc.nextLine().toLowerCase();
        System.out.println("Enter the second string: ");
        String s=sc.nextLine().toLowerCase();
        if(f.length()!=s.length()){
            System.out.println("No");
            System.exit(0);
        }
        char first[]=new char[f.length()];
        char second[]=new char[s.length()];
        int i;
        for(i=0;i<f.length();i++){
            first[i]=f.charAt(i);
            second[i]=s.charAt(i);
        }
        Arrays.sort(first);
        Arrays.sort(second);
        for(i=0;i<f.length();i++){
            if(first[i]!=second[i])
                break;
        }
        if(i<f.length())
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}