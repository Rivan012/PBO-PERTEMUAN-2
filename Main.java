package Enkapsulasi;

class Mahasiswa{
    private String nama;
    private int umur;

    public void setDataMahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public String getDataMahasiswa(){
        return "Nama Saya "+ this.nama + " dan umur saya adalah " + this.umur ;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setDataMahasiswa("Rivan Alfatoni", 19);
        System.out.println(mhs1.getDataMahasiswa());
        
    }
}
