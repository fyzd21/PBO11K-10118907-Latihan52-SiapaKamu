/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan52.siapakamu;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan siapa kamu
 * 
 */
public class PBO11K10118907Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.setNip("41227829930");
        d.setUmur(27);
        d.setNama("Rizki Adam Kurniawan");
        System.out.println("NIP Dosen : "+d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        
        System.out.println("");
        Mahasiswa m = new Mahasiswa();
        m.setNim("10110269");
        m.setUmur(17);
        m.setNama("Nindi");
        System.out.println("NIM Mahasiswa : "+m.getNim());
        m.siapaKamu();
        m.kelasApa();
    }
    
}
