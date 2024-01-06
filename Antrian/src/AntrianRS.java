import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AntrianRS {

  static class Pasien implements Comparable<Pasien> {
    String nama;
    int prioritas;

    public Pasien(String nama, int prioritas) {
      this.nama = nama;
      this.prioritas = prioritas;
    }

    @Override
    public int compareTo(Pasien o) {
      return Integer.compare(this.prioritas, o.prioritas);
    }
  }

  public static Map<String, List<Pasien>> antrianRS(List<String> dokter, List<Pasien> pasien) {
    Map<String, List<Pasien>> jadwalDokter = new HashMap<>();
    for (String d : dokter) {
      jadwalDokter.put(d, new ArrayList<>());
    }

    Collections.sort(pasien);

    for (Pasien p : pasien) {
      List<String> dokterTersedia = new ArrayList<>();
      for (String d : jadwalDokter.keySet()) {
        if (jadwalDokter.get(d).size() < 8) {
          dokterTersedia.add(d);
        }
      }

      Collections.sort(dokterTersedia, (a, b) -> jadwalDokter.get(a).size() - jadwalDokter.get(b).size());

      String dokterPilihan = dokterTersedia.get(0);
      jadwalDokter.get(dokterPilihan).add(p);
    }

    return jadwalDokter;
  }

  public static void main(String[] args) {
    List<String> dokter = new ArrayList<>();
    dokter.add("dokter1");
    dokter.add("dokter2");
    dokter.add("dokter3");

    List<Pasien> pasien = new ArrayList<>();
    pasien.add(new Pasien("pasien1", 3));
    pasien.add(new Pasien("pasien2", 1));
    pasien.add(new Pasien("pasien3", 2));
    pasien.add(new Pasien("pasien4", 4));
    pasien.add(new Pasien("pasien5", 5));

    Map<String, List<Pasien>> jadwal = antrianRS(dokter, pasien);
    jadwal.keySet().forEach((d) -> {
        System.out.println(d + ": " + jadwal.get(d));
      });
  }
}
