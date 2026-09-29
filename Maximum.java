import java.util.*;

class Maximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for (int i = 1; i < 10; i++) {
            if (a[i] > max)
                max = a[i];
        }

        System.out.println("Maximum = " + max);
    }
}