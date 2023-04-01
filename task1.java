import java.util.Scanner;

// 1 Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N,
//         которая состоит из чередующихся символов c1 и c2, начиная с c1.
//
// Пример. (n = 6, c1='a', c2='b') -> "ababab"
// (n = 8, c1='x', c2='y') -> "xyxyxyxy"
//
// static String buildString(int n, char c1, char c2) {
//     // TODO: 28.03.2023 Домашнее задание!
//     return null;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число больше 0: ");
        int n = scanner.nextInt();

        System.out.print("Введите первый символ: ");
        char c1 = scanner.next().charAt(0);

        System.out.print("Введите второй символ: ");
        char c2 = scanner.next().charAt(0);

        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                System.out.print(c1);
            } else {
                System.out.print(c2);
            }
        }
    }
}
