/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7_1;

/**
 *
 * @author Deltaviyahya
 */
public class non_anggota extends Salon {
    public non_anggota(String nama, String anggota) {
        super("Ova", "Non-Anggota");
    }
    @Override
    public double disc_perawatan() {
        return perawatan;
    }
    @Override
    public void info_pelanggan() {
        System.out.println("Nama pelanggan : " + getNama());
        System.out.println("Jenis keanggotaan : " + getAnggota());
    }
    @Override
    public void info_bayar() {
        System.out.println("Biaya perawatan : Rp " + getPerawatan());
        System.out.println("Biaya perawatan setelah diskon : Rp " + disc_perawatan());
        System.out.println("Pembelian produk : Rp " + getProduk());
        System.out.println("Harga produk setelah diskon : Rp " + getProdukdisc());
        System.out.println("Total biaya : Rp " + getTotal());
        System.out.println("");
    }
}
