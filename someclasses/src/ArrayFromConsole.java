import java.util.Scanner;

public class ArrayFromConsole {
    /**
     * Метод зоплняет масиив определенной длинны заначениями запрошенными у
     * пользователя, разделителями могут выступать пробелыб, недостающие
     * элементы будут заполнены 0
     * ОГРАНИЧЕНИЯ: только целые числа
     * @param countOfArray длина массива не может быть меньше 0
     * @return массив целочисленныз начений
     */
    static int[] getNumbersOfArray1(int countOfArray) {   // ввод чисел пользователем
        int[] arrOfNumbers;
        if (countOfArray > 0) {
            arrOfNumbers = new int[countOfArray];
            System.out.println("Type " + countOfArray + " numbers and press ENTER after each numeral");
            int i = 0;
            try {
                Scanner scan = new Scanner(System.in).useDelimiter(" *");
                while (i < arrOfNumbers.length && scan.hasNextInt() && scan.hasNext()) {
                    arrOfNumbers[i] = scan.nextInt();
                    i++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bad format" + e);
            }
        } else {
            System.out.println("error 1");
            arrOfNumbers = new int[0];
        }
        return arrOfNumbers;
    }
}

