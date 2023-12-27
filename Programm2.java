package FirstDay;

import java.util.Scanner;

public class Programm2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //год месяц день
        int year, month, date;
        int days = 0; // количество дней
        // Получаем год, месяц и день, введенные пользователем
        System.out.println("Пожалуйста, введите дату:");
        year = sc.nextInt();
        month = sc.nextInt();
        date = sc.nextInt();
        // Используя структуру цикла, последовательно накапливаем количество дней в месяце (не включая месяц во входном месяце)
        for (int i = 1; i < month; i++) {
            // Используем структуру switch для вычисления количества дней в месяце
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
                case 2:
                    // Решение о високосном году
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days += 29;
                        break;
                    } else {
                        days += 28;
                        break;
                    }
            }
        }
        // Суммируем количество дней, прошедших в текущем месяце, во входной дате
        days += date;
        System.out.printf("%s год% d месяц% d день -% d день текущего года\n", year, month, days);

    }
}
