import java.util.Scanner;

public class soalAkhir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS : ");
        int nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int nilaiUAS = sc.nextInt();
        double nilaiAkhir = (nilaiUAS+nilaiUTS)/2;

        String nilaiHuruf="";
        String keteranganHuruf="";
        if (nilaiAkhir <= 100) {
            nilaiHuruf="A";
            keteranganHuruf="Sangat Baik";
        } else if (nilaiAkhir <= 80) {
            nilaiHuruf="B+";
            keteranganHuruf="Lebih dari Baik";
        } else if (nilaiAkhir <= 73) {
            nilaiHuruf="B";
            keteranganHuruf="Baik";
        } else if (nilaiAkhir <= 65) {
            nilaiHuruf="C+";
            keteranganHuruf="Lebih dari Cukup";
        } else if (nilaiAkhir <= 60) {
            nilaiHuruf="C";
            keteranganHuruf="Cukup";
        } else if (nilaiAkhir <= 49) {
            nilaiHuruf="E";
            keteranganHuruf="Gagal";
        } else {
            System.out.print("Tidak terdapat nilai yang terdeteksi");
        }

        System.out.println("Nilai akhir (AVG) : "+nilaiAkhir);
        System.out.println("Nilai Huruf Akhir : " + nilaiHuruf);
        System.out.println("Kualifikasi nilai : "+keteranganHuruf);
        sc.close();
    }

}