import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt(); 
        int pos=sc.nextInt();
        int[] newArr=new int[n + 1]; 
        for (int i=0;i<n;i++) {
            if (i<pos-1) {
                newArr[i]=arr[i];
            } else if(i==pos-1) {
                newArr[i]=ele;
            } else {
                newArr[i]=arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}