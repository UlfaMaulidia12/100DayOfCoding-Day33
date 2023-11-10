package ProgramDay30;

import java.util.Scanner;

public class HitungGajiKaryawan {

    private static int gajiBersih;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gajiBersihku = 0;
        int gajiBersih2 = 0;
        int gajiBersih3 = 0;
        int gajiBersih4 = 0;
        int gajiBersih5 = 0;

        for (int a = 1; a <= 5; a++) {
            // Input validation for the number of working days
            while (true) {
                System.out.print("Masukkan Nama Karyawan " + a + "\t: ");
                String namaKaryawan = input.next();

                System.out.print("Masukkan Jumlah Hari Kerja : ");
                int hariKerja = input.nextInt();

                if (hariKerja > 0) {
                    // Proceed with calculations
                    int gajiKotorperhari = 120000;
                    int uangMakan = 15000;
                    int TotMakan = uangMakan * hariKerja;
                    int gajiKotor = gajiKotorperhari * hariKerja;
                    int gajiBersih = gajiKotor - TotMakan;

                    System.out.println("=======================================");
                    System.out.println("Karyawan " + a);
                    System.out.println("Nama Karyawan \t\t: " + namaKaryawan);
                    System.out.println("Jumlah Hari Kerja \t: " + hariKerja + " Hari");
                    System.out.println("Uang Makan Perhari \t: Rp." + uangMakan);
                    System.out.println("Gaji Kotor \t\t: Rp." + gajiKotor);
                    System.out.println("Gaji Bersih \t\t: Rp." + gajiBersih);
                    System.out.println("Total Biaya Karyawan \t: Rp." + (gajiKotor + TotMakan));
                    System.out.println("=======================================");

                    // Calculate and display total expenses for each employee
                    gajiBersihku += gajiBersih;

                    // Assign gajiBersih to the respective variable based on the employee number
                    switch (a) {
                        case 1:
                            gajiBersih2 = gajiBersih;
                            break;
                        case 2:
                            gajiBersih3 = gajiBersih;
                            break;
                        case 3:
                            gajiBersih4 = gajiBersih;
                            break;
                        case 4:
                            gajiBersih5 = gajiBersih;
                            break;
                        default:
                            break;
                    }

                    break;
                } else {
                    System.out.println("Masukkan jumlah hari kerja yang valid.");
                }
            }
        }

        // Calculate average and maximum salary
        int rataRataGaji = (gajiBersihku + gajiBersih2 + gajiBersih3 + gajiBersih4 + gajiBersih5) / 5;
        int gajiMaksimum = Math.max(Math.max(Math.max(Math.max(gajiBersih, gajiBersih2), gajiBersih3), gajiBersih4), gajiBersih5);

        // Display average and maximum salary
        System.out.println("Rata-rata Gaji Karyawan \t: Rp." + rataRataGaji);
        System.out.println("Gaji Tertinggi \t\t: Rp." + gajiMaksimum);
        System.out.println("Dana Yang Harus di Keluarkan Perusahaan : Rp." + gajiBersihku);
    }
}
