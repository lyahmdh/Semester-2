// Exercise 10.27

import java.util.Scanner;

public class MyStringBuilder1Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uji Konstruktor
        System.out.print("Masukkan string awal: ");
        String inputStr = scanner.nextLine();
        MyStringBuilder1 sb1 = new MyStringBuilder1(inputStr);
        System.out.println("sb1: " + sb1);

        // Uji append untuk menambahkan String
        System.out.print("Masukkan string untuk ditambahkan: ");
        String appendStr = scanner.nextLine();
        MyStringBuilder1 sb2 = new MyStringBuilder1(appendStr);
        sb1.append(sb2);
        System.out.println("After append(sb2): " + sb1);

        // Uji append untuk menambahkan int
        System.out.print("Masukkan angka untuk ditambahkan: ");
        int appendInt = scanner.nextInt();
        sb1.append(appendInt);
        System.out.println("After append(int): " + sb1);

        // Uji length()
        System.out.println("Length: " + sb1.length());

        // Uji pengambilan char pada index yang diinginkan
        System.out.print("Masukkan indeks untuk mendapatkan karakter: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < sb1.length()) {
            System.out.println("Character at index " + index + ": " + sb1.charAt(index));
        } else {
            System.out.println("Indeks di luar batas!");
        }

        // Uji perubahan menjadi lowercase
        MyStringBuilder1 sbLower = sb1.toLowerCase();
        System.out.println("Lowercase sb1: " + sbLower);

        // 7. Uji substring
        System.out.print("Masukkan indeks awal substring: ");
        int begin = scanner.nextInt();
        System.out.print("Masukkan indeks akhir substring: ");
        int end = scanner.nextInt();
        if (begin >= 0 && end <= sb1.length() && begin < end) {
            MyStringBuilder1 sbSub = sb1.substring(begin, end);
            System.out.println("Substring (" + begin + ", " + end + "): " + sbSub);
        } else {
            System.out.println("Indeks tidak valid!");
        }

        scanner.close();
    }
}