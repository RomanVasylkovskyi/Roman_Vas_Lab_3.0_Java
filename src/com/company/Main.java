package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void TASK1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nДана строка. Преобразовать в ней все строчные буквы  (как латинские, так и кириллические) в прописные, а прописные — в строчные.\n ");

        String st = "Дана строка Some Text";
        String newSt = st;
        int oldChar;
        int newChar;

        for (int i = 0; i < st.length(); i++) {
            System.out.print(st.charAt(i));
        }
        System.out.println();

        for (int i = 0; i < st.length(); i++) {

            if (((int) st.charAt(i) >= 1040) && ((int) st.charAt(i) <= 1071)) {
                oldChar = st.charAt(i);
                newChar = st.charAt(i) + 32;
                newSt = st.replace((char) oldChar, (char) newChar);
            }
            if (((int) st.charAt(i) >= 1072) && ((int) st.charAt(i) <= 1103)) {
                oldChar = st.charAt(i);
                newChar = st.charAt(i) - 32;
                newSt = st.replace((char) oldChar, (char) newChar);
            }
            if (((int) st.charAt(i) >= 65) && ((int) st.charAt(i) <=90)) {
                oldChar = st.charAt(i);
                newChar = st.charAt(i) + 32;
                newSt = st.replace((char) oldChar, (char) newChar);
            }
            if (((int) st.charAt(i) >= 97) && ((int) st.charAt(i) <= 122)) {
                oldChar = st.charAt(i);
                newChar = st.charAt(i) - 32;
                newSt = st.replace((char) oldChar, (char) newChar);
            }
            System.out.print(newSt.charAt(i));
        }
        StartMenu();
    }

    public  static  void  TASK2()
    {
        System.out.println("\n Дана строка, состоящая из слов кириллицей, разделенных пробелами\n" +
                "(одним или несколькими). Найти количество слов в строке.");
        int n =0;
        String str = "Просто тестовий текст для проби";
        String[] words = str.split(" ");
        System.out.println(str);
        for (String word : words) {
            n++;
        }
        System.out.println(" Кільксть слів >> "+ n);

        StartMenu();
    }

    public  static  void  TASK3()
    {
        System.out.println(" \nДана непустая строка. Вывести коды ее первого и последнего символа.");

        String str = "Просто тестовий текст";

        int max = str.length()-1;

        System.out.println(str);
        System.out.println("Перший елемент >> "+str.charAt(0)+" Кодировка >> "+(int) str.charAt(0));
        System.out.println("Перший елемент >> "+str.charAt(max)+" Кодировка >> "+(int) str.charAt(max));


        StartMenu();

    }
    public static  void StartMenu()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Введіть номер задачі >>");
        int numer = sc.nextInt();

        switch (numer)
        {

            case 1 :
                TASK1();
                break;

            case 2 :
                TASK2();
                break;

            case 3 :
                TASK3();
                break;
        }
    }

    public static void main(String[] args)
    {
        StartMenu();
    }
}