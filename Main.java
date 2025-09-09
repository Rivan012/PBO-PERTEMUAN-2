package Constructor;

class constructor {
    String nama;
    String hobi;
    int umur;
    
    constructor(String nama,String hobi,int umur){
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }
}
public class Main {
    public static void main(String[] args) {
        constructor mhs1 = new constructor("Rivan Alfatoni", "Main Roblox", 19);
        System.out.println("Nama Saya : "+ mhs1.nama);
        System.out.println("Hobi Saya : "+ mhs1.hobi);
        System.out.println("Umur Saya : "+ mhs1.umur + " Tahun");
    }
}
