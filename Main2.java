import java.util.Scanner;
public class Main2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int newEle=sc.nextInt();
        int[] newArr=new int[arr.length + 1];
        for (int i=0;i<arr.length; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1] = newEle;
        System.out.print(" after insertion: ");
       for(int num:newArr){
            System.out.print(num + " ");
       }
    }
}