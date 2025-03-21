import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int newElement=sc.nextInt();
        int[] newArr=new int[n + 1];
        newArr[0]=newElement;
        for (int i=0;i<n;i++) {
            newArr[i + 1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}