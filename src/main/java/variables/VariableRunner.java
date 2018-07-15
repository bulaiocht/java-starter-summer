package variables;

//Это объявление класса
public class VariableRunner {

    // это объявление main метода для запуска программы
    public static void main(String[] args) {

        //Это однострочный комментарий

        /*Этот
        * комментарий
        * многострочный*/

        // Объявление и инициализация переменных значениями

        boolean boolVal = true; //true or false

        //целочисленные переменные
        byte byteVal = 127; //8 bit

        short shortVal = 1024; //16 bit

        char charVal = 'c'; //16 bit

        int intValue = 350; //32 bit

        long longVal = 350L; //64 bit

        //переменные с плавающей точкой
        float floatVal = 2.3F; //32 bit

        double doubleVal = 2.3; //64 bit

        // запись 2.3d тоже валидна
        double anotherDoubleVal = 2.3d;

        //Приведение типов от меньшего к большему происходит автоматически

        int first = 10;

        long second = first;

        char third = 'A';

        int fourth = third;
        //Распечатаем результат

        System.out.println("Переменная типа int: " + first);
        System.out.println("Переменная типа long: " + second);

        System.out.println("Переменная типа char: " + third);
        System.out.println("Переменная типа char в виде числа: " + fourth);

        System.out.println("Число 95 в виде символа UNICODE: " + (char) 95);

        //Приведение типов от большего к меньшему должно происходить явно, но может привести к потере данных
        long tooLong = 256000000000L;

        //int notEnoughSpace = tooLong; //ошибка компилляции

        int notEnoughSpace = (int) tooLong; //ошибки компилляции нет, но результат будет неожиданным.

        //Распечатаем результат
        System.out.println("Оригинально значение переменной типа long: " + tooLong);
        System.out.println("Значение переменной после приведения к int: " + notEnoughSpace);


        //Это цикл. О нём я расскажу вам позже
        for (int i = 33; i < 500; i++) {
            System.out.printf( "%s ", (char) i );
        }

    }
}
