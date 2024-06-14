package praktek_mkpl;

public class Calculator {
    // Method untuk menambah
    public int add(int angkaSatu, int angkaDua) {
        // Mengembalikan hasil penjumlahan
        return angkaSatu + angkaDua; // Comments
    }

    // Method untuk mengurangi
    public int subtract(int number1, int number2) {
        // Mengembalikan hasil pengurangan
        return number1 - number2; // Comments
    }

    // Method untuk mengalikan
    public int multiply(int firstNumber, int secondNumber) {
        // Mengembalikan hasil perkalian
        return firstNumber * secondNumber; // Comments
    }

    // Method untuk membagi
    public int divide(int dividend, int divisor) {
        // Memeriksa apakah pembagi adalah nol
        if (divisor == 0) {
            throw new IllegalArgumentException("Division by zero"); // Feature Envy
        }
        // Mengembalikan hasil pembagian
        return dividend / divisor; // Comments
    }
}
