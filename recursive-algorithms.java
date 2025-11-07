public class SumOfDigits {
    public static int sumOfDigits(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }
        // Рекурсивный случай
        return n % 10 + sumOfDigits(n / 10);
    }
    
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Сумма цифр числа " + num + " = " + sumOfDigits(num));
        
        // Вывод: Сумма цифр числа 12345 = 15
    }
}
