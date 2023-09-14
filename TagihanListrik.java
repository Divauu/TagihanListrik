import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pemakaian listrik (dalam kWh)");
        double pemakaian = input.nextDouble();

        int tarif = 0;

        if (pemakaian <= 50) {
            tarif = 100;
        } else if (pemakaian <=150){
            tarif = 150;
        } else if (pemakaian >=250){
            tarif = 300;
        } else {
            System.out.println("error");
        }

        double biayapemakaian = pemakaian*tarif;
        double biayatambahan = biayapemakaian * 20/100;

        System.out.println("Biaya Pemakaian : Rp." + biayapemakaian);
        System.out.println("Biaya Pemakaian : Rp." + biayatambahan);

        double total = biayapemakaian + biayatambahan;

        System.out.println("Total tagihan yang harus dibayar : Rp." + total);

        input.close();

    }
}
