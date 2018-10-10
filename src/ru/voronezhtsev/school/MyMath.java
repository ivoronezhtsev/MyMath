package ru.voronezhtsev.school;

/**
 * Утилитный класс для работы с математическими операциями
 * @author Воронежцев Игорь
 */
public class MyMath {

    /**
     * @param c начало отрезка cd
     * @param d конец отрезка cd
     * @param a массив целых чисел
     * @return количество целых чисел массива a, принадлежащих отрезку сd
     */
    public static int getComponentsCount( int c, int d, int ... a) {
        int count = 0;
        int start = c;
        int end = d;
        if(c > d) {
            start = d;
            end = c;
        }
        for(int i : a) {
            if(i >= start && i <=end) {
                count++;
            }
        }
        return count;
    }
}
