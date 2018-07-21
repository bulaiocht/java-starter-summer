package javadocs;

/**
 * Этот класс нужен чтобы показать как использовать javadoc
 * @author John Doe
 */
public class JavadocExample {

    /**
     * age - возраст.
     * Мы используем тип {@code int} для простоты
     */
    private int age;

    /**
     * name - имя и фамилия.
     */
    private String name;

    /**
     * Это конструктор по-умолчанию.
     * Он не принимает аргументов, однако его можно использовать
     * для инициализации полей.
     */
    public JavadocExample(){
        this.age = -1;
        this.name = "NONAME";
    }

    /**
     * Этот конструктор принимает два аргумента: возраст и имя.
     * Пример использования этого конструктора может выглядеть так:
     * {@code JavadocExample example = new JavadocExample(10, "Billy Bob")}
     * <p>
     * @param age возраст
     * @param name имя
     */
    public JavadocExample(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
