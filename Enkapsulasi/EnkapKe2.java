class Mahasiswa{
    private String nama;
    private int umur;

    public void setDataMahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    private String getDataMahasiswa(){
        return "Nama Saya "+ nama + " dan umur saya adalah " + umur;
    }
    public String getHidedDataMhs(){
        return "Hai, "+getDataMahasiswa();
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setDataMahasiswa("Rivan Alfatoni", 19);
        System.out.println(mhs1.getHidedDataMhs());
    }
}
