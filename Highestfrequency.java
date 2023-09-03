import java.util.*;
class Highestfrequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> count=new ArrayList<>();
        int c=0,temp=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]!=temp){
                num.add(temp);
                temp=arr[i];
                count.add(c);
                c=1;
            }
            else
                c++;
        }
        num.add(temp);
        count.add(c);
        int max=count.get(0),index=0;
        for(int i=0;i<count.size();i++){
            if(count.get(i)>max){
                max=count.get(i);
                index=i;
            }
        }
        System.out.println("Result= "+num.get(index));
    }
}