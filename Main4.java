import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int[] newArr=new int[arr.length - 1];
        for(int i=1;i<arr.length;i++){
        newArr[i-1]=arr[i];
        }
        System.out.print(Arrays.toString(newArr));
    }
}