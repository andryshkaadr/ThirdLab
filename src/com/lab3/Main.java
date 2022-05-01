package com.lab3;

public class Main {

    /*
     * Дана строка, изображающая двоичную запись целого положительного числа.
     * Вывести строку, изображающую десятичную запись этого же числа.
     * */
    static boolean task24() {
        String s = "1001101011";
        int value;
        int binaryNotation = 0;
        int counter;
        try {
            value = Integer.parseInt(s);
            int arr[] = new int[s.length()];
            counter = s.length();
            for (int i = s.length() - 1; i >= 0; i--) {
                arr[i] = value % 10;
                value = value / 10;
            }
            for (int i = 0; i < arr.length; i++) {
                counter--;
                binaryNotation += (int) (arr[i] * Math.pow(2, counter));
            }
            System.out.println(binaryNotation);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Incorrect value");
            return false;
        }
    }

    /*
     *Дана строка, состоящая из слов кириллицей, разделенных пробелами (одним или несколькими).
     *Вывести строку, содержащую эти же слова, разделенные одним символом «.» (точка).
     *В конце строки точку не ставить.
     **/
    static void task47() {
        String s = " hsdfh  Hello ddyjn     fafsd ";
        s = s.trim();
        s = s.replaceAll("( )+", ".");
        System.out.println(s);
    }

    /*
     *  Дана строка. Подсчитать количество содержащихся в ней цифр
     * */
    static void task13() {
        String s = "1) В  эт0й строке_ : 6 цифр123";
        int counter = s.length() - s.replaceAll("\\d+", "").length();
        System.out.println(counter);
    }

    public static void main(String[] args) {
        task24();
        task47();
        task13();
    }
}