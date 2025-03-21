public class Insert {
    public static void main(String[] args) {
        
        // Define the original array
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int newElement = 6;
        
        int[] newArr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }

        newArr[n] = newElement;

        System.out.print("New array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        
    }
}
