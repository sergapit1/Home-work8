package by.academy.homework8;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String text = "Я люблю JAVA";
        System.out.println(text.matches("h?"));      //
        System.out.println(text.matches("h*"));      //  matches() метод пытается сопоставить всю строку с шаблоном
        System.out.println(text.matches("h+"));      //


        Pattern pattern1 = Pattern.compile("h?");   //  true: допустимо нулевое вхождение  X, once or not at all (X, один раз или ни разу)
        Pattern pattern2 = Pattern.compile("h*");   //  true: допустимо нулевое вхождение  X, zero or more times (X, ноль или более раз)
        Pattern pattern3 = Pattern.compile("h+");   //  false: недопустимо нулевое вхождение X, one or more times  (X, один или более раз)

        System.out.println("_________");

        System.out.println(pattern1.matcher(text).find());   //
        System.out.println(pattern2.matcher(text).find());   //  find() пытается найти вхождение шаблона в данной строке
        System.out.println(pattern3.matcher(text).find());   //
    }
}