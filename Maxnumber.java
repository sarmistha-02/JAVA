import java.util.*;
class Maxnumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<size;i++){
            while(arr[i]>0){
                int d=arr[i]%10;
                li.add(d);
                arr[i]=arr[i]/10;
            }
        }
        String res="";
        Collections.sort(li);
        for(int i=li.size()-1;i>=0;i--){
            res=res+((char)(li.get(i)+'0'));
        }
        System.out.println("Result="+res);
    }
}