package ru.gb.regular;

/**
 * Декоратор. Он декорирует.
 */
public class Decorator {
    /**
     * @param a Число
     * @return Текст с числом
     */
    public static String decorate(int a){
        return String.format("Here is your number: %d.", a);
    }
}
