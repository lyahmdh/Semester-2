import java.util.List;

public class Kategori {
    private String namaKategori;
    private List<Buku> bukuBuku;
    
    public Kategori(String namaKategori, List<Buku> bukuBuku) {
        this.namaKategori = namaKategori;
        this.bukuBuku = bukuBuku;
    }
    
    public String getNamaKategori() {
        return namaKategori;
    }
    
    public List<Buku> getBukuBuku() {
        return bukuBuku;
    }
}
