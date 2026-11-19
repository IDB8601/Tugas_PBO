 class GradeCalculator {
    public double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

class ReportPrinter {
    public void cetakLaporan(String nama, double nilai) {
        System.out.println("Laporan Nilai Mahasiswa: " + nama + " = " + nilai);
    }
}

class StudentRepository {
    public void simpanDatabase(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}

public class Case2 {
    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        ReportPrinter printer = new ReportPrinter();
        StudentRepository repository = new StudentRepository();

        double nilai = calculator.hitungNilaiAkhir(80, 85, 90);
        printer.cetakLaporan("Andi", nilai);
        repository.simpanDatabase("Andi", nilai);
    }
}