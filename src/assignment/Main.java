package assignment;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Karyawan objek1 = new Karyawan(123, "Joko", 6_000_000, 2.5f);
        Karyawan objek2 = new Karyawan(124, "Supriyanto", 6_000_000, 24.3f);

        printKaryawan(objek1);
        System.out.println();
        printKaryawan(objek2);
    }

    /**
     * Print karyawan information
     *
     * @param karyawan karyawan
     */
    private static void printKaryawan(Karyawan karyawan) {
        System.out.println("Nama: " + karyawan.getNama());
        System.out.println("NIP: " + karyawan.getNip());
        System.out.println("Gaji: " + getFormatterCurrency(karyawan.getGaji()));
        System.out.println("Lama Kerja: " + karyawan.getLamaKerja() + " tahun");
        System.out.println("Bonus: " + getFormatterCurrency(karyawan.calculateBonus()));
    }

    /**
     * Format currency to Indonesian Rupiah
     *
     * @param currency currency
     * @return formatted currency
     */
    private static String getFormatterCurrency(float currency) {
        Locale locale = Locale.of("id", "ID");
        return NumberFormat.getCurrencyInstance(locale).format(currency);
    }
}
