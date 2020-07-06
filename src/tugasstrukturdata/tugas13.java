/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasstrukturdata;

import java.util.LinkedList;

/**
 *
 * @author EndaMarza
 */
public class tugas13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LinkedList<class13> senarai= new LinkedList<class13>();
        class13 class13;

        //masukkan 5 nama
        senarai.addFirst(new class13("END","Enda"));
        senarai.addFirst(new class13("ZAS","Zaskia"));
        senarai.addFirst(new class13("RIN","Rina Melati"));
        senarai.addFirst(new class13("FAR","Farhan"));
        senarai.addFirst(new class13("AGN","Agnes Monica"));

        System.out.println("Keadaan awal: ");
        for(int i=0; i<senarai.size(); i++){
            class13 = senarai.get(i);
            class13.display();
        }
        hapus(senarai,"RIN");
        System.out.println();
        System.out.println("Setelah RIN dihapus: ");
        for(int i=0; i<senarai.size(); i++){
            class13=senarai.get(i);
            class13.display();
        }
        //cari RIN
        String dicari="RIN";
        System.out.println();
        System.out.println("Pencarian"+dicari);
        class13 posisiData=cari(senarai,dicari);
        if(posisiData==null)
            System.out.println(dicari+"tidak ditemukan");
        else{
            System.out.println("Hasil Pencatian");
            posisiData.display();
        }
        //cari FAR
        dicari="FAR";
        System.out.println();
        System.out.println("Pencarian"+dicari);
        posisiData=cari(senarai,dicari);
        if(posisiData==null)
            System.out.println(dicari+"tidak ditemukan");
        else{
            System.out.println("Hasil Pencatian");
            posisiData.display();
        }
    }
    //untuk menghapus data
    public static void hapus(LinkedList<class13> senarai, String x){
        int posisi=-1;
        for(int i=0; i<senarai.size(); i++){
            class13 class13=senarai.get(i);
            if(class13.kode.compareTo(x)==0){
                posisi=i;
                break;
            }
        }
        if(posisi!=-1)
            senarai.remove(posisi);
        else
            System.out.println(x+"tidak dapat dihapus");
    }
    //untuk encari data berdasarkan kode
    public static class13 cari(LinkedList<class13>senarai, String x){
        int posisi=-1;
        for(int i=0; i<senarai.size(); i++){
            class13 class13=senarai.get(i);
            if(class13.kode.compareTo(x)==0){
                posisi=i;
                break;
            }
        }
        if(posisi==-1)
            return null;
        else
            return senarai.get(posisi);
    }

}
