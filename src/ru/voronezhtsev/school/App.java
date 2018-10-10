package ru.voronezhtsev.school;

/**
 * ДЗ №1. еобходимо написать программу на языке Java, которая  инициализирует класс MyMath()
 * у которого реализован метод принимающий на вход целые числа с и d и массив целых чисел a,
 * возвразающий числовое значение количества компонентов массива значения которых принадлежат отрезку c d.
 * Чиловой ряд а в метод можно передавать, как массив, так и через запятую. Результат должен быть выведен в консоли.
 * @author Воронежцев Игорь on 10.10.2018
 */
public class App {
    private static final String COMPONENTS_COUNT = "Количество значений массива входящих в отрезок [c, d]: (параметр "
            + "как массив):";
    private static final String COMPONENTS_COUNT_LIST = "Количество значений массива входящих в отрезок [c, d]: " +
            "(параметр как список через запятую):";
    public static void main(String[] args) {
        System.out.println(COMPONENTS_COUNT_LIST +
                MyMath.getComponentsCount(1, 3, 1,2, 3, 4, 5));
        System.out.println(COMPONENTS_COUNT +
                MyMath.getComponentsCount(1, 3, new int[]{1,2, 3, 4, 5}));

    }
}
