package strings;

public class StringsMain5 {
    public static void main(String[] args) {
        String name = "Саша";
        String result = name.concat(" , учится Java");
        String result1 = name + " , учится Java";
        int[] arr = {132, 54845, 5254, 5454, 4486, 5484, 1};

        System.out.println(name);
        System.out.println(result);
        System.out.println(result1);
        System.out.println("Саша".concat(" , учится Java"));

        String number = String.valueOf(arr[5]);
        System.out.println(number);

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(String.valueOf(true));

        String text = String.join(", ", new String[] {"Имя 1", "Имя 6", "Имя 5"});
        System.out.println(text);
        System.out.println (joinArrayToString("!!!!!!!! ", new String[] {"Илья", "Сергей", "Коля"}));


    }

    /**
     * Матод создает новую строку в которую помещает элементы массива разделяя
     * их между собой с помощью разделителя
     * @param delimiter разделитель. Пример: ", "
     * @param array массив строк. Пример: {"Илья", "Сергей", "Коля"}
     * @return итоговая строка с элементами. Пример "Илья, Сергей, Коля"
     */
    public static String joinArrayToString(String delimiter, String[] array){
        if (array == null || array.length == 0) {
            return "";
        }
        if (delimiter == null){
            throw new IllegalArgumentException("Делиметр не может быть null");
        }

        String result = (array[0] != null) ? array[0] : "";

        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                if (result.length() > 0) {
                    result += delimiter;
                }
                result += array[i];
            }
        }

        return result;
    }
}
