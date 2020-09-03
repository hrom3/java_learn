package strings;

public class StringsMain6 {
    public static void main(String[] args) {
        System.out.println (joinArrayToString("!!!!!!!! ", new String[] {"Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля", "Илья", "Сергей", "Коля"}));
        System.out.println (joinArrayToString(", ", new String[10]));

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

        StringBuilder result = new StringBuilder((array[0] != null) ? array[0] : "");
        /*
        Занимает меньше времени, чем конкатекнация (+) но нао чень больших массивах
        данных. StringBuffer работает как и StringBuilder, но потокобезопасен
        */

        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                if (result.length() > 0) {
                    result.append(delimiter);
                }
                result.append(array[i]);
            }
        }


        return result.toString();
    }
}
