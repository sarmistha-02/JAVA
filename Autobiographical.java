import java.util.*;
public class Autobiographical
{
	public int FindAutoCount(String n){
	    int[] ar=new int[n.length()];
	    for (int i=0;i<n.length();i++)
	        ar[i]=(int)(n.charAt(i)-'0');
	   
	    Arrays.sort(ar);
	    int c=1,i,d=0;
	    int[] temp=new int[10];
	    for(i=0;i<temp.length;i++)
	        temp[i]=0;
	        
	    for(i=1;i<n.length();i++){
	        if(ar[i]==ar[i-1])
	            c++;
	        else{
	            temp[ar[i-1]]=c;
	            c=1;
	        }
	    }
	    temp[ar[i-1]]=c;
	    c=0;
	    
	    for(i=0;i<n.length();i++){
	        if(temp[i]!=(int)(n.charAt(i)-'0'))
	            return 0;
	        else{
	            if(temp[i]!=0)
	                c++;
	        }
	    }
	    
	    return c;
	}
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s=sc.nextLine();
		Autobiographical obj=new Autobiographical();
		int res=obj.FindAutoCount(s);
		System.out.println("Result= "+res);
	}
}