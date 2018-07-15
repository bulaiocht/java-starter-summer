package ifelseandswitch;

import java.util.Calendar;
import java.util.Scanner;

public class IfElseSwitchRunner {
    public static void main(String[] args) {

        //Здесь мы рассмотрим пример с использованием конструкции if-else
        //Эта конструкция используется повсеместно в программировании.

        //Scanner нужен для чтения пользовательского ввода из консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВЕДИТЕ ПОЛОЖИТЕЛЬНОЕ ЧИСЛО ОТ 0 ДО 100");
        int input = scanner.nextInt();

        // Если условие в круглых кобочках выполняется,
        // то выполнится блок кода в фигурных скобочках после if
        // В противном случае выполнится блок кода в фигурных скобочках после else
        // Если вам нужно проверить какое-то промежуточное условие,
        // то можно использовать промежуточную конструкцию else-if

        if (input < 0 || input > 100) {

            System.out.println("ВЫ ВВЕЛИ НЕПРАВИЛЬНОЕ ЧИСЛО");

        } else if (input == 42){

            System.out.println("ОТВЕТ НА ГЛАВНЫЙ ВОПРОС ЖИЗНИ, ВСЕЛЕННОЙ И ВСЕГО ТАКОГО: " + input);

        } else {

            System.out.println("СПАСИБО, ВЫ ВВЕЛИ " + input);

        }

        //Здесь мы рассмотрим пример с использованием конструкции switch

        // Calendar - это класс из библиотеки языка java.
        // Он нужен для работы с датами.
        // В этой строчке мы получаем значение текущего месяца в виде целого числа в промежутке от 0 до 11
        // Например если текущий месяц Январь, то мы получим число 0 а если Март то 3
        int month = Calendar.getInstance().get(Calendar.MONTH);

        // В этой строчке мы получаем номер текущего года в виде целого числа
        // Например в текущем году мы получим число 2018, а в следующем 2019
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Current year is: " + year);

        // Это конструкция switch
        // Она нужна для того чтобы обрабатывать конечное число доступных вариантов.
        // Например в данном случае мы обрабатываем номера месяцев
        // и выводм в консоль число дней в этом месяце
        switch (month){
            case 0 :
                System.out.print("January");
                System.out.print(" 31 days");
                break;
            case 1 :
                System.out.print("February");

                //В Феврале обычно 28 дней. Однако в високосные годы в Феврале на один день больше.
                //Здесь мы определяем високосный ли текущий год.
                if ( year % 4 == 0 && (!(year % 100 == 0) || (year % 400 == 0))){

                    System.out.print(" 29 days");

                } else {
                    System.out.print(" 28 days");
                }

                break;
            case 2 :
                System.out.print("March");
                System.out.print(" 31 days");
                break;
            case 3 :
                System.out.print("April");
                System.out.print(" 30 days");
                break;
            case 4 :
                System.out.print("May");
                System.out.print(" 31 days");
                break;
            case 5 :
                System.out.print("June");
                System.out.print(" 31 days");
                break;
            case 6 :
                System.out.print("July");
                System.out.print(" 31 days");
                break;
            case 7 :
                System.out.print("August");
                System.out.print(" 31 days");
                break;
            case 8 :
                System.out.print("September");
                System.out.print(" 31 days");
                break;
            case 9 :
                System.out.print("October");
                System.out.print(" 31 days");
                break;
            case 10 :
                System.out.print("November");
                System.out.print(" 31 days");
                break;
            case 11 :
                System.out.print("December");
                System.out.print(" 31 days");
                break;
            //Если ни одно из условий выше не выполнилось,
            //то выполняется действие по-умолчанию
            default:
                System.out.println("That's weird");
                break;
        }


    }
}
