// import java.util.Scanner;

// public class MyStringBuilder2Test {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Uji Konstruktor
//         System.out.print("Masukkan string awal: ");
//         String inputStr = scanner.nextLine();
//         MyStringBuilder2 sb1 = new MyStringBuilder2(inputStr);
//         System.out.println("sb1: " + sb1);

//         // Uji append untuk menambahkan String
//         System.out.print("Masukkan string untuk ditambahkan: ");
//         String appendStr = scanner.nextLine();
//         MyStringBuilder2 sb2 = new MyStringBuilder2(appendStr);
//         sb1.append(sb2);
//         System.out.println("After append(sb2): " + sb1);

//         // Uji append untuk menambahkan int
//         System.out.print("Masukkan angka untuk ditambahkan: ");
//         int appendInt = scanner.nextInt();
//         sb1.append(appendInt);
//         System.out.println("After append(int): " + sb1);

//         // Uji length()
//         System.out.println("Length: " + sb1.length());

//         // Uji pengambilan char pada index yang diinginkan
//         System.out.print("Masukkan indeks untuk mendapatkan karakter: ");
//         int index = scanner.nextInt();
//         if (index >= 0 && index < sb1.length()) {
//             System.out.println("Character at index " + index + ": " + sb1.charAt(index));
//         } else {
//             System.out.println("Indeks di luar batas!");
//         }

//         // Uji perubahan menjadi lowercase
//         MyStringBuilder2 sbLower = sb1.toLowerCase();
//         System.out.println("Lowercase sb1: " + sbLower);

//         // Uji substring
//         System.out.print("Masukkan indeks awal substring: ");
//         int begin = scanner.nextInt();
//         System.out.print("Masukkan indeks akhir substring: ");
//         int end = scanner.nextInt();
//         if (begin >= 0 && end <= sb1.length() && begin < end) {
//             MyStringBuilder2 sbSub = sb1.substring(begin, end);
//             System.out.println("Substring (" + begin + ", " + end + "): " + sbSub);
//         } else {
//             System.out.println("Indeks tidak valid!");
//         }

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class MyStringBuilder2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Uji Konstruktor
        System.out.print("Masukkan string awal: ");
        String inputStr = scanner.nextLine();
        MyStringBuilder2 sb1 = new MyStringBuilder2(inputStr);
        System.out.println("sb1: " + sb1);

        while (true) {
            // Menampilkan pilihan operasi
            System.out.println("\nPilih operasi:");
            System.out.println("1. Append String");
            System.out.println("2. Append Integer");
            System.out.println("3. Length");
            System.out.println("4. Substring");
            System.out.println("5. To Lowercase");
            System.out.println("6. Character at Index");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan (1-7): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Uji append untuk menambahkan String
                    scanner.nextLine(); // Membersihkan buffer scanner
                    System.out.print("Masukkan string untuk ditambahkan: ");
                    String appendStr = scanner.nextLine();
                    MyStringBuilder2 sb2 = new MyStringBuilder2(appendStr);
                    sb1.append(sb2);
                    System.out.println("After append(sb2): " + sb1);
                    break;

                case 2:
                    // Uji append untuk menambahkan int
                    System.out.print("Masukkan angka untuk ditambahkan: ");
                    int appendInt = scanner.nextInt();
                    sb1.append(appendInt);
                    System.out.println("After append(int): " + sb1);
                    break;

                case 3:
                    // Uji length()
                    System.out.println("Length: " + sb1.length());
                    break;

                case 4:
                    // Uji substring
                    System.out.print("Masukkan indeks awal substring: ");
                    int begin = scanner.nextInt();
                    System.out.print("Masukkan indeks akhir substring: ");
                    int end = scanner.nextInt();
                    if (begin >= 0 && end <= sb1.length() && begin < end) {
                        MyStringBuilder2 sbSub = sb1.substring(begin, end);
                        System.out.println("Substring (" + begin + ", " + end + "): " + sbSub);
                    } else {
                        System.out.println("Indeks tidak valid!");
                    }
                    break;

                case 5:
                    // Uji perubahan menjadi lowercase
                    MyStringBuilder2 sbLower = sb1.toLowerCase();
                    System.out.println("Lowercase sb1: " + sbLower);
                    break;

                case 6:
                    // Uji pengambilan char pada index yang diinginkan
                    System.out.print("Masukkan indeks untuk mendapatkan karakter: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < sb1.length()) {
                        System.out.println("Character at index " + index + ": " + sb1.charAt(index));
                    } else {
                        System.out.println("Indeks di luar batas!");
                    }
                    break;

                case 7:
                    // Keluar dari program
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return; // Keluar dari loop dan program

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih antara 1 hingga 7.");
            }
        }
    }
}
