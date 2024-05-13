import java.util.Scanner;

public class ArrayToSearch {
    static int[] arr;
    private static Scanner sc;
    int num;
    public ArrayToSearch(int[] arr, int num){
        this.arr = arr;
        this.num = num;
    }
    public int search(int num){
        int lowIx = 0;
        int highIx = arr.length - 1;
        while (lowIx <= highIx) {
            int midIx = (lowIx + highIx) / 2;
            if (num == arr[midIx]) {
                return midIx;
            }
            if (num < arr[midIx]) {
                highIx = midIx - 1;
            }
            if (num > arr[midIx]) {
                lowIx = midIx + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayToSearch Array = new ArrayToSearch(arr, 8);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of arrray?");
        for (int i : sc.next.token.toArray) {

        }
    }
}

