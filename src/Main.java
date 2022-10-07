import java.util.ArrayList;
import java.util.Scanner;

/*
Дана строка, содержащая несколько неповторяющихся символов. Нужно вывести все варианты перестановок этих символов (в любом порядке).
Так, для строки "abc" должны быть выведены следующие перестановки:
abc
acb
bac
bca
cab
cba
*/

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите строку для перестановки: ");
        String numbers = new Scanner(System.in).nextLine();
        if (numbers.isBlank()) numbers = "abc";

        int length = numbers.length();
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Исходная строка: " + numbers);

        String str = numbers;
        for (int i = 0; i < length; i++) {
            str = swapSymbols(str, i - 1, i);
            System.out.println(str);
            strings.add(str);

            for (int j = 0; j < length - 1; j++) {
                if (j == i) continue;

                for (int k = 0; k < length; k++) {
                    if (k == i || k == j) continue;

                    str = swapSymbols(str, j, k);
                    strings.add(str);
                    System.out.println(str);
                }
            }
        }
        System.out.println("Всего вариантов: " + strings.size());
    }

    private static String swapSymbols(String str, int x, int y) {
        if (x < 0) return str;
        char[] array = str.toCharArray();
        char charX = array[x];
        char charY = array[y];
        array[x] = charY;
        array[y] = charX;
        return String.copyValueOf(array);
    }
}
