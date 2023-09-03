import java.util.*;
class Freqchar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter the character: ");
        char x=sc.next().charAt(0);
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
            arr[i]=str.charAt(i);
        Arrays.sort(arr);
        int max=1,c=1,i;
        char maxchar=arr[0];
        for(i=1;i<str.length();i++){
            if(arr[i-1]!=arr[i]){
                if(c>max){
                    max=c;
                    maxchar=arr[i-1];
                }
                c=1;
            }
            else
                c++;
        }
        if(c>max){
            max=c;
            maxchar=arr[i-1];
        }
        String res="";
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==maxchar)
                res+=x;
            else
                res+=str.charAt(i);
        }
        System.out.println("Result: "+res);
    }
}