package cycles;

import java.util.Scanner;

public class CycleRunner {


    public static void main(String[] args) {

        //Это цикл со счетчиком
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

        int counter = 0;

        //Это бесконечный цикл без счетчика
        //он использует переменную counter для своего завершения.
        for ( ; ; ){

            System.out.println(counter);

            if (counter == 10){
                break;
            }

            counter++;
        }


        //Это цикл do-while.
        //Он выполнит дествие в фигурных скобочках хотябы один раз
        do {
            System.out.println("Hello");
        } while (false);



        int counter2 = 0;
        boolean condition = true;

        //Это цикл while
        //Он использует булеву переменную condition для завершения
        //Он будет выполняться бесконечно до тех пор пока condition является true
        while (condition){

            if (counter2 == 20){
                condition = false;
            }

            if (counter2 % 2 == 0) {

                System.out.println("Counter is even: " + counter2);

            } else {

                System.out.println("Counter is odd: " + counter2);

            }

            counter2++;

        }

        //Это дурацкий пример со взломщиком пароля.
        int password = 285639;
        int guess = 0;

        while (true){

            if (guess == password){

                System.out.println("ВЗЛОМАНО!");

                //break завершает выполнение цикла
                break;

            } else {

                guess++;

            }

        }

        //Этот пример показывает чем полезен цикл while
        //Цикл while в данном случае будет выполняться до тех пор
        // пока пользователь не введёт нужную нам фразу.

        //Scanner это класс, у которого много методов для чтения из консоли.
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("If you want to quit type: EXIT");

            // String - объектный тип, не примитивный.
            // String представляет собой любую строку текста.
            // метод сканера nextLine() возвращает строку текста,
            // введённую пользователем в консоль.
            String answer = scanner.nextLine();

            // метод equalsIgnoreCase() сравнит две строки текста на равенство
            // не зависимо от того строчные буквы или прописные и вернёт true или false
            // В данном случае если сравнить слова "EXIT" и "exit" то метод вернёт true
            if (answer.equalsIgnoreCase("EXIT")){

                System.out.println("GOOD BOI!");

                //ключевое слово break завершит выполнение цикла.
                break;

            } else {

                System.out.println("Try again!");

            }

        }

        //Этот пример показывает использование ключевых слов: continue, break и return

        int bound = 11;

        for (int i = 0; i < bound; i++){

            if (i % 2 == 0) {

                //Ключевое слово continue
                //отправит нас в начало цикла и увеличит наш счетчик
                continue;
            }

            if (i % 3 == 0){

                System.out.println(i);

            }

            if (i == 10) {

                //Ключевое слово break завершит наш цикл.
                break;
            }

            if (i == 9){

                //Ключевое слово return завершит наш метод main()
                //код написанный после return уже не выполнится.
                return;
            }

        }

        System.out.println("End of main method");

        //Плохой пример с метками.
        //Не используйте метки
//        outer:
//        for (int i = 0; i <10; i++){
//
//            System.out.println("I = " + i);
//
//            inner:
//            for (int j = 0; j < 10; j++){
//
//                System.out.println("J = " + j);
//
//                mostInner:
//                for (int k = 0; k < 10; k++){
//
//                    System.out.println("K = " + k);
//
//                    if (k == 9){
//
//                        break inner;
//
//                    }
//                }
//
//            }
//
//        }


    }


}
