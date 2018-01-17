package school.lemon.koboziev;

import java.io.*;

import java.util.Random;

public class Hater {
    public static int rnd()///рандомнй генератор случайных чисел в промежутке
    {
        int min = -1;
        int max = 4;
        max -= min;
        return Math.abs((int) (Math.random() * ++max) + min);
    }

    public static int rndb() {////рандомный генератор случайных букв
        Random r = new Random();
        System.out.println(r);
        int h = (int) (97 + (Math.random() * (122 - 97)));
        return h;
    }

    public static String str = "Adolf Gitler";

    public static void main(String[] args) {
        String[] strr = str.split(" ");////разбиение масива на два массива через пробел
        int n = rnd();///генерируем случайное число
        System.out.println(n);
        char a = (char) rndb();/////генерируем случайную букву
        char[] mychar1 = strr[0].toCharArray();///разбиваем первую строку (полученую ранее) на массив символов
        System.out.println("Выбираем эту букву = " + mychar1[n]);
        mychar1[n] = a;
        System.out.println("и");
        System.out.println("Меняем на эту = " + mychar1[n]);
        System.out.println(mychar1);
        mychar1[rnd()] = a;
        System.out.println(" меняем еще одну букву");
        System.out.println(mychar1);
        System.out.println(" меняем еще одну букву");
        mychar1[rnd()] = a;
        System.out.println(mychar1);


    }
}
