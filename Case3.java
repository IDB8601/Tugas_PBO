interface Vehicle {
    void jalan();
}

interface Startable {
    void startEngine();
}

interface FuelPowered {
    void isiBahanBakar();
}

interface BatteryPowered {
    void isiBaterai();
}

class MobilBensin implements Vehicle, Startable, FuelPowered {
    public void jalan() { System.out.println("Mobil bensin berjalan..."); }
    public void startEngine() { System.out.println("Menyalakan mesin kendaraan..."); }
    public void isiBahanBakar() { System.out.println("Mengisi bahan bakar kendaraan..."); }
}

class MobilListrik implements Vehicle, Startable, BatteryPowered {
    public void jalan() { System.out.println("Mobil listrik berjalan..."); }
    public void startEngine() { System.out.println("Menyalakan mesin kendaraan..."); }
    public void isiBaterai() { System.out.println("Mengisi baterai kendaraan listrik..."); }
}

class Sepeda implements Vehicle {
    public void jalan() { System.out.println("Sepeda dikayuh..."); }
}

// Kendaraan baru: tinggal tambah, kode lama tidak diubah (OCP)
class MobilHybrid implements Vehicle, Startable, FuelPowered, BatteryPowered {
    public void jalan() { System.out.println("Mobil hybrid berjalan..."); }
    public void startEngine() { System.out.println("Menyalakan mesin kendaraan..."); }
    public void isiBahanBakar() { System.out.println("Mengisi bahan bakar kendaraan..."); }
    public void isiBaterai() { System.out.println("Mengisi baterai kendaraan listrik..."); }
}

public class Case3 {
    public static void main(String[] args) {
        MobilListrik mobilListrik = new MobilListrik();
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();

        Sepeda sepeda = new Sepeda();
        sepeda.jalan();
        
    }
}