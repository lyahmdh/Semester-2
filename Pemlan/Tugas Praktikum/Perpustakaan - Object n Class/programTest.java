import java.util.*;

public class programTest {
    public static void main(String[] args) {
        List<Kategori> kategoriList = new ArrayList<>();
        kategoriList.add(new Kategori("Teknologi", Arrays.asList(
            new Buku("Pemrograman Java", Arrays.asList(new Penulis("Budi Santoso"))),
            new Buku("Sistem Operasi", Arrays.asList(new Penulis("Ari Widodo"))),
            new Buku("Jaringan Komputer", Arrays.asList(new Penulis("Dian Setiawan"), new Penulis("Fajar Nugroho"))),
            new Buku("Keamanan Siber", Arrays.asList(new Penulis("Eka Pratama"))),
            new Buku("Analisis Data", Arrays.asList(new Penulis("Gilang Ramadhan")))
        )));

        kategoriList.add(new Kategori("Filsafat", Arrays.asList(
            new Buku("Filsafat Klasik", Arrays.asList(new Penulis("Aristoteles"))),
            new Buku("Pemikiran Modern", Arrays.asList(new Penulis("Immanuel Kant"))),
            new Buku("Eksistensialisme", Arrays.asList(new Penulis("Jean-Paul Sartre"))),
            new Buku("Filsafat Timur", Arrays.asList(new Penulis("Lao Tzu"))),
            new Buku("Dialektika Hegel", Arrays.asList(new Penulis("Georg Hegel")))
        )));

        // kategoriList.add(new Kategori("Sejarah", Arrays.asList(
        //     new Buku("Filsafat Klasik", Arrays.asList(new Penulis("Aristoteles"))),
        //     new Buku("Pemikiran Modern", Arrays.asList(new Penulis("Immanuel Kant"))),
        //     new Buku("Eksistensialisme", Arrays.asList(new Penulis("Jean-Paul Sartre"))),
        //     new Buku("Filsafat Timur", Arrays.asList(new Penulis("Lao Tzu"))),
        //     new Buku("Dialektika Hegel", Arrays.asList(new Penulis("Georg Hegel")))
        // )));

        // kategoriList.add(new Kategori("Agama", Arrays.asList(
        //     new Buku("Filsafat Klasik", Arrays.asList(new Penulis("Aristoteles"))),
        //     new Buku("Pemikiran Modern", Arrays.asList(new Penulis("Immanuel Kant"))),
        //     new Buku("Eksistensialisme", Arrays.asList(new Penulis("Jean-Paul Sartre"))),
        //     new Buku("Filsafat Timur", Arrays.asList(new Penulis("Lao Tzu"))),
        //     new Buku("Dialektika Hegel", Arrays.asList(new Penulis("Georg Hegel")))
        // )));

        // kategoriList.add(new Kategori("Psikologi", Arrays.asList(
        //     new Buku("Filsafat Klasik", Arrays.asList(new Penulis("Aristoteles"))),
        //     new Buku("Pemikiran Modern", Arrays.asList(new Penulis("Immanuel Kant"))),
        //     new Buku("Eksistensialisme", Arrays.asList(new Penulis("Jean-Paul Sartre"))),
        //     new Buku("Filsafat Timur", Arrays.asList(new Penulis("Lao Tzu"))),
        //     new Buku("Dialektika Hegel", Arrays.asList(new Penulis("Georg Hegel")))
        // )));

        // kategoriList.add(new Kategori("Politik", Arrays.asList(
        //     new Buku("Filsafat Klasik", Arrays.asList(new Penulis("Aristoteles"))),
        //     new Buku("Pemikiran Modern", Arrays.asList(new Penulis("Immanuel Kant"))),
        //     new Buku("Eksistensialisme", Arrays.asList(new Penulis("Jean-Paul Sartre"))),
        //     new Buku("Filsafat Timur", Arrays.asList(new Penulis("Lao Tzu"))),
        //     new Buku("Dialektika Hegel", Arrays.asList(new Penulis("Georg Hegel")))
        // )));

        // kategoriList.add(new Kategori("Fiksi", Arrays.asList(
        //     new Buku("Filsafat Klasik", Arrays.asList(new Penulis("Aristoteles"))),
        //     new Buku("Pemikiran Modern", Arrays.asList(new Penulis("Immanuel Kant"))),
        //     new Buku("Eksistensialisme", Arrays.asList(new Penulis("Jean-Paul Sartre"))),
        //     new Buku("Filsafat Timur", Arrays.asList(new Penulis("Lao Tzu"))),
        //     new Buku("Dialektika Hegel", Arrays.asList(new Penulis("Georg Hegel")))
        // )));

        for (Kategori kategori : kategoriList) {
            System.out.println("Kategori: " + kategori.getNamaKategori());
            for (Buku buku : kategori.getBukuBuku()) {
                System.out.print("- " + buku.getJudul() + " (Penulis: ");
                for (int i = 0; i < buku.getPenulis().size(); i++) {
                    System.out.print(buku.getPenulis().get(i).getNama());
                    if (i < buku.getPenulis().size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println(")");
            }
            System.out.println();
        }
    }
}
