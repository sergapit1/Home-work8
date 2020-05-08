package by.academy.homework8;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String text = "Я люблю JAVA";
        System.out.println(text.matches("h?"));
        System.out.println(text.matches("h*"));
        System.out.println(text.matches("h+"));

        Pattern pattern1 = Pattern.compile("h?");
        Pattern pattern2 = Pattern.compile("h*");
        Pattern pattern3 = Pattern.compile("h+");

        System.out.println("_________");

        System.out.println(pattern1.matcher(text).find());
        System.out.println(pattern2.matcher(text).find());
        System.out.println(pattern3.matcher(text).find());
    }
}