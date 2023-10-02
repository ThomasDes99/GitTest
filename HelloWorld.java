import java.util.Scanner;

class Compare {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Nhap a: ");
            int a = input.nextInt();
            System.out.print("Nhap b: ");
            int b = input.nextInt();
            if (a < b) {
                System.out.println(a + " nho hon " + b);
            } else if (a == b) {
                System.out.println(a + " bang " + b);
            } else {
                System.out.println(a + " lon hon " + b);
            }

        }
        

        /*
        int a = 0;
        if (a < 0) {
            System.out.println("a la so am.");
        } else if (a == 0) {
            System.out.println("a bang 0");
        } else {
            System.out.println("a la so duong");
        }
         */
    }
}