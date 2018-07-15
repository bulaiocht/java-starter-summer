package arrays;

public class ArraysRunner {

    public static void main(String[] args) {

        //Объявление и инициализация массива

        //Типы массивов
        //Можно создать массив с любым типом данных.
        boolean [] booleans;
        byte [] bytes;
        char [] chars;
        short [] shorts;
        int [] ints;
        long [] longs;
        float [] floats;
        double [] doubles;
        String [] strings;
        ArraysRunner [] arraysRunners;
        Object [] objects;
        System [] systems;

        //Инициализация массива размером 10 элементов
        //Значения элементов по умолчанию -> 0
        int [] intArray1 = new int[10];

        //Инициализация размера массива и его элементов значениями
        int [] intArray2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Раздельное объявление переменной и инициализация
        int [] intArray3;
        intArray3 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Литерал null означает, что переменная array не указывает ни на какой массив в памяти
        int array [] = null;

        //Теперь переменная указывает на массив размером 5 элементов
        array = new int[5];

        //Доступ к элементам массива по индексу
        //Запись элементов в массив
        //Заметьте, что индексы начинаются с 0
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;

        //Чтение из массива
        int second = array[1];

        //Размер массива
        int size = array.length;

        //Обход элементов массива в цикле for
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }

        //Специальный цикл foreach
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        //Если попытаться получить элемент массива по несуществующему индексу,
        //то произойдет ошибка ArrayIndexOutOfBoundsException
        //int nonexistent = array[10];

        //Двумерные массивы можно себе представить как таблицы в которых есть строки и столбцы.
        //Например в этом массиве 5 "строк" и 10 "столбцов"
        int [][] table = new int[5][10];

        //На самом деле двумерные массивы это массивы массивов,
        //тоесть в каждой ячейке материнского массива хранится по еще одному массиву.

        //Для обхода двумерных массивов применяют вложенные циклы
        //Внешний цикл отсчитывает "строки"
        for (int i = 0; i < table.length; i++) {

            //Внутренний цикл отсчитывает "столбцы"
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();

        }

        //Массив это ссылочный тип данных
        //Это ссылка на массив интеджеров, но она пока никуда не указывает.
        int [] link1;

        //Теперь ссылка указывает на объект, созданный в памяти - массив из трёх интеджеров.
        link1 = new int[]{1, 2, 3};

        //На один объект могут указывать много ссылок
        //Все эти ссылки теперь указывают на один объект.
        int [] link2 = link1;
        int [] link3 = link1;

        //Распечатаем все массивы
        for (int i : link1) {System.out.print(i + " ");}
        System.out.println();

        for (int i : link2) {System.out.print(i + " ");}
        System.out.println();

        for (int i : link3) {System.out.print(i + " ");}
        System.out.println();

        //Поменяем элемент в массиве с помощью ссылки №1
        link1[0] = 999;

        //Распечатаем снова все массивы
        for (int i : link1) {System.out.print(i + " ");}
        System.out.println();

        for (int i : link2) {System.out.print(i + " ");}
        System.out.println();

        for (int i : link3) {System.out.print(i + " ");}
        System.out.println();

    }
}
