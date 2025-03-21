import java.util.*;
public class Main3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
         System.out.print(arr[i]);
        }
    }
}