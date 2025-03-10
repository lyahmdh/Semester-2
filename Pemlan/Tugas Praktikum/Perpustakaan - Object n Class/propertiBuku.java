public class propertiBuku {
    
}

import java.util.*;

// Kelas Penulis
class Penulis {
    private String namaPenulis;

    public Penulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }
}

// Kelas Buku
class Buku {
    private String judul;
    private List<Penulis> penulis;

    public Buku(String judul, List<Penulis> penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public List<Penulis> getPenulis() {
        return penulis;
    }
}

// Kelas Kategori
class Kategori {
    private String namaKategori;
    private List<Buku> bukuList;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.bukuList = new ArrayList<>();
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public List<Buku> getBukuList() {
        return bukuList;
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }
}

// import java.util.*;

// public class ProgramTest {
//     public static void main(String[] args) {
//         // Membuat data kategori, buku, dan penulis
//         Kategori teknologi = new Kategori("Teknologi");
//         teknologi.tambahBuku(new Buku("Pemrograman Java", Arrays.asList(new Penulis("Andi"), new Penulis("Budi"))));
//         teknologi.tambahBuku(new Buku("Dasar Komputer", Arrays.asList(new Penulis("Citra"))));
//         teknologi.tambahBuku(new Buku("AI dan Machine Learning", Arrays.asLi...
// }

// import java.util.*;

// // Kelas utama untuk Kategori, Buku, dan Penulis
// public class KategoriBukuPenulis {
//     // Kelas Penulis
//     public static class Penulis {
//         private String namaPenulis;

//         public Penulis(String namaPenulis) {
//             this.namaPenulis = namaPenulis;
//         }

//         public String getNamaPenulis() {
//             return namaPenulis;
//         }
//     }

//     // Kelas Buku
//     public static class Buku {
//         private String judul;
//         private List<Penulis> penulis;

//         public Buku(String judul, List<Penulis> penulis) {
//             this.judul = judul;
//             this.penulis = penulis;
//         }

//         public String getJudul() {
//             return judul;
//         }

//         public List<Penulis> getPenulis() {
//             return penulis;
//         }
//     }

//     // Kelas Kategori
//     public static class Kategori {
//         private String namaKategori;
//         private List<Buku> bukuList;

//         public Kategori(String namaKategori) {
//             this.namaKategori = namaKategori;
//             this.bukuList = new ArrayList<>();
//         }

//         public void tambahBuku(Buku buku) {
//             bukuList.add(buku);
//         }

//         public String getNamaKategori() {
//             return namaKategori;
//         }

//         public List<Buku> getBukuList() {
//             return bukuList;
//         }
//     }
// }
