import java.util.Scanner;
public class studiKasus1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan diskon :");
        String diskon = sc.nextLine();

        if (diskon.equalsIgnoreCase("DISKON20")) {
            System.out.println("Potongan 20%");
        } else if (diskon.equals("DISKON10")) {
            System.out.println("Potongan 10%");
        } else if (diskon.equals("DISKON5")) {
            System.out.println("Potongan 5%");
        } else {
            System.out.println("Kode Tidak Valid");
        }
    }
}