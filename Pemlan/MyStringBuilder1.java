// Exercise 10.27

public class MyStringBuilder1 {
    private StringBuilder str;

    // Constructor
    public MyStringBuilder1(String s) {
        str = new StringBuilder(s);
    }

    // Method untuk menambahkan String
    public MyStringBuilder1 append(MyStringBuilder1 s) {
        str.append(s.toString());
        return this;
    }

    // Method untuk menambahkan int
    public MyStringBuilder1 append(int i) {
        str.append(i);
        return this;
    }

    // Mengambil panjang dari String
    public int length() {
        return str.length();
    }

    // Mengambil char spesifik pada index yang diinginkan
    public char charAt(int index) {
        return str.charAt(index);
    }

    // Mengubah menjadi lowercase
    public MyStringBuilder1 toLowerCase() {
        return new MyStringBuilder1(str.toString().toLowerCase());
    }

    // Mengambil substring dari index (begin) sampai index (end)
    public MyStringBuilder1 substring(int begin, int end) {
        return new MyStringBuilder1(str.substring(begin, end));
    }

    // Mengubah ke String
    @Override
    public String toString() {
        return str.toString();
    }
}
