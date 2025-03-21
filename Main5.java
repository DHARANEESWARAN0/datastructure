import java.util.*;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int[] newArr=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
        newArr[i]=arr[i];
        }
        System.out.print(Arrays.toString(newArr));
    }
}