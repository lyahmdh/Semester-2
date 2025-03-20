public class MyStringBuilder2 {
    private String str; // Menyimpan string sebagai objek String

    // Konstruktor untuk menginisialisasi MyStringBuilder2 dengan string yang diberikan
    public MyStringBuilder2(String s) {
        str = s; // Menyimpan string yang diberikan ke dalam str
    }

    // Menambahkan string dari objek MyStringBuilder2 lain
    public MyStringBuilder2 append(MyStringBuilder2 s) {
        str += s.toString(); // Menambahkan string dari objek lain menggunakan operator +
        return this; // Mengembalikan objek saat ini untuk chaining
    }

    // Menambahkan integer ke dalam MyStringBuilder2
    public MyStringBuilder2 append(int i) {
        str += Integer.toString(i); // Mengonversi integer ke string dan menambahkannya
        return this; // Mengembalikan objek saat ini untuk chaining
    }

    // Mengembalikan panjang string yang ada dalam MyStringBuilder2
    public int length() {
        return str.length(); // Mengembalikan panjang string
    }

    // Mengambil karakter pada posisi tertentu
    public char charAt(int index) {
        if (index >= 0 && index < str.length()) {
            return str.charAt(index); // Mengembalikan karakter pada indeks yang diberikan
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    // Mengubah seluruh string menjadi huruf kecil
    public MyStringBuilder2 toLowerCase() {
        str = str.toLowerCase(); // Mengubah seluruh string menjadi huruf kecil
        return this; // Mengembalikan objek saat ini untuk chaining
    }

    // Mengambil substring dari indeks mulai hingga indeks akhir (exclusive)
    public MyStringBuilder2 substring(int begin, int end) {
        if (begin < 0 || end > str.length() || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        str = str.substring(begin, end + 1); // Mengambil substring
        return this; // Mengembalikan objek saat ini untuk chaining
    }

    // Mengonversi MyStringBuilder2 menjadi String
    @Override
    public String toString() {
        return str; // Mengembalikan string yang disimpan dalam str
    }
}
