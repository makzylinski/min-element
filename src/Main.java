import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = readIntegers();
        System.out.println("Minimum " + findMin(arr));
    }

    public static String[] readIntegers() {
        Scanner s = new Scanner(System.in);
        System.out.println("Print comma delimited ints");
        String numbers = s.nextLine();
        return numbers.split(",");
    }

    public static int findMin(String[] arr) {
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if(Integer.parseInt(arr[i]) < min) {
                min = Integer.parseInt(arr[i]);
            }
        }

        return min;
    }
}
