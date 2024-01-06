
package latihan2;

/**
 *
 * @author Gilang
 */
public class daftarFilm {
    String namaFilm, genre, rating, durasi;
    
    daftarFilm(String paramNama, String paramGenre, String paramRating, String paramDurasi){
        namaFilm = paramNama;
        genre = paramGenre;
        rating = paramRating;
        durasi = paramDurasi;
        
        System.out.println("Nama Film   : " +namaFilm);
        System.out.println("Genre Film  : " +genre);
        System.out.println("Rating Film : " +rating);
        System.out.println("Durasi      : " +durasi);
        System.out.println("");
    }
}
