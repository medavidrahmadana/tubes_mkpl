package praktek_mkpl;

public class Main {
    public static void main(String[] args) {
        // Membuat objek kalkulator
        Calculator calculatorObjekKalkulator = new Calculator();

        // Variabel untuk operasi kalkulator
        int angkaPertamaUntukPenjumlahan = 10;
        int angkaKeduaUntukPenjumlahan = 5;
        int variabelPenjumlahan = 0; // Duplicated Code & Temporary Field
        variabelPenjumlahan = calculatorObjekKalkulator.add(angkaPertamaUntukPenjumlahan, angkaKeduaUntukPenjumlahan); // Long Variable Name
        
        System.out.println("Hasil penjumlahan " + angkaPertamaUntukPenjumlahan + " dan " + angkaKeduaUntukPenjumlahan + " adalah: " + variabelPenjumlahan);

        // Pengurangan
        int angkaPertamaUntukPengurangan = 10; // Duplicated Code
        int angkaKeduaUntukPengurangan = 5;
        int variabelPengurangan = calculatorObjekKalkulator.subtract(angkaPertamaUntukPengurangan, angkaKeduaUntukPengurangan);
        
        System.out.println("Hasil pengurangan " + angkaPertamaUntukPengurangan + " dan " + angkaKeduaUntukPengurangan + " adalah: " + variabelPengurangan);

        // Perkalian
        int angkaPertamaUntukPerkalian = 10; // Duplicated Code
        int angkaKeduaUntukPerkalian = 5;
        int variabelPerkalian = calculatorObjekKalkulator.multiply(angkaPertamaUntukPerkalian, angkaKeduaUntukPerkalian);

        System.out.println("Hasil perkalian " + angkaPertamaUntukPerkalian + " dan " + angkaKeduaUntukPerkalian + " adalah: " + variabelPerkalian);

        // Pembagian
        int angkaPertamaUntukPembagian = 10; // Duplicated Code
        int angkaKeduaUntukPembagian = 5;
        int variabelPembagian = 0;

        try {
            variabelPembagian = calculatorObjekKalkulator.divide(angkaPertamaUntukPembagian, angkaKeduaUntukPembagian);
            System.out.println("Hasil pembagian " + angkaPertamaUntukPembagian + " dan " + angkaKeduaUntukPembagian + " adalah: " + variabelPembagian);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Metode untuk cetak hasil
        cetakHasilPenjumlahan(angkaPertamaUntukPenjumlahan, angkaKeduaUntukPenjumlahan, variabelPenjumlahan);
        cetakHasilPengurangan(angkaPertamaUntukPengurangan, angkaKeduaUntukPengurangan, variabelPengurangan);
        cetakHasilPerkalian(angkaPertamaUntukPerkalian, angkaKeduaUntukPerkalian, variabelPerkalian);
        cetakHasilPembagian(angkaPertamaUntukPembagian, angkaKeduaUntukPembagian, variabelPembagian);
    }

    // Method untuk cetak hasil penjumlahan
    private static void cetakHasilPenjumlahan(int a, int b, int hasil) {
        System.out.println("Penjumlahan " + a + " + " + b + " = " + hasil);
    }

    // Method untuk cetak hasil pengurangan
    private static void cetakHasilPengurangan(int a, int b, int hasil) {
        System.out.println("Pengurangan " + a + " - " + b + " = " + hasil);
    }

    // Method untuk cetak hasil perkalian
    private static void cetakHasilPerkalian(int a, int b, int hasil) {
        System.out.println("Perkalian " + a + " * " + b + " = " + hasil);
    }

    // Method untuk cetak hasil pembagian
    private static void cetakHasilPembagian(int a, int b, int hasil) {
        System.out.println("Pembagian " + a + " / " + b + " = " + hasil);
    }
}
