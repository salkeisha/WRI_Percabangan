import java.util.Scanner;
public class studiKasusPenulis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int halaman = 3;
        int hari;
        int totalHalaman=0;

        System.out.print("Jumlah hari penulis ingin menulis : ");
        hari = sc.nextInt();

        for (int i=1; i <= hari; i++) {
            if (i % 5 == 0) {
                continue;
            }
            totalHalaman+=halaman;
        }
        System.out.println("Jumlah halaman yang ditulis adalah : "+totalHalaman);
        sc.close();
    }
}