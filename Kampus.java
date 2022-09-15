/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasusuts;

/**
 *
 * @author HP-14s
 */
public class Kampus {
    
    int NIM;
    String Nama;
    String Judul_TA;
    String Bimbingan;
    String Dosen;
    
    
    public Kampus(){
        this.NIM = 0;
        this.Nama = "";
        this.Judul_TA = "";
        this.Bimbingan = "";
    }
    
    public int NIM_Mahasiswa (int Nama){
        return this.NIM;
    }
    public String Nama_Mahasiswa (int Nama){
        return this.Nama;
    }
    public String Judul_TA (int Nama){
        return this.Judul_TA;
    }
    public String Bimbingan (int Nama){
        return this.Bimbingan;
    }
    
    public void setNIM_Mahasiswa () {
        int nim = this.NIM;
    }
    public void setNama_Mahasiswa (){
        String nama = this.Nama;
    }
    public void setJudul_TA (){
        String judul = this.Judul_TA;
    }
    public void Bimbingan (){
        String bimbingan = this.Bimbingan;
    }
    public void Dosen (){
        String dosen = this.Dosen;
    }
}
