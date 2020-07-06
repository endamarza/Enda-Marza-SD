/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasstrukturdata;

/**
 *
 * @author EndaMarza
 */
public class tugas15 {

   public static void main(String[] args) {
        int arr[]={5,3,1,9,8,2,4,7};
        System.out.println("---Array BEFORE praktik15---");
        printArray(arr);
        tugas15Detail(arr);
        System.out.println("---Array AFTER praktik15---");
        printArray(arr);
    }
    static void tugas15Detail(int[]array){
        int n = array.length;
        int temp=0;
        for(int i=0;i < n;i++)
        { System.out.println("Sort yang ke"+(i+1));
        for(int j=1;j < (n-i);j++){
            System.out.println("Bandingkan"+array[j-1]+"dan"+array[j]);
            if(array[j-1]>array[j]){
                temp=array[j-1];
                array[j-1]=array[j];
                array[j]=temp;
                System.out.println(array[j]+ "lebih besar dari pada" + array[j-1]);
                System.out.println("tukar elemen: Array baru setelah tukar");
                printArray(array);
            }
        }
        }
    }
    static void printArray(int[]array){
        for(int i=0;i<array.length;i++){
        System.out.println(array[i]+" ");
    }
        System.out.println();
    }
}
