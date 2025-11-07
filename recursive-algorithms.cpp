#include <iostream>
using namespace std;

int sum_of_digits(int n) {
    // Базовый случай
    if (n < 10) {
        return n;
    }
    // Рекурсивный случай
    return n % 10 + sum_of_digits(n / 10);
}

int main() {
    int num = 12345;
    cout << "Сумма цифр числа " << num << " = " << sum_of_digits(num) << endl;
    
    // Вывод: Сумма цифр числа 12345 = 15
    return 0;
}
