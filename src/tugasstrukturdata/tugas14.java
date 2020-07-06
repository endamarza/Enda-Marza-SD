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
public class tugas14 {

    void tugas14(int arr[]) {
    int n = arr.length;
    for (int i = 0;i < n-1;i++)
        for (int j = 0;j < n-i-1;j++)
            if (arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= temp;
                
            }
}
       void printArray(int arr[])
       {
           int n=arr.length;
           for (int i=0;i<n;++i)
               System.out.print(arr[i]+"");
           System.out.println();
       }
       public static void main(String args[])
       {
           tugas14 ob=new tugas14();
           int arr[] = {5,3,1,9,8,2,4,7};
           ob.tugas14(arr);
           System.out.println("Sorted array");
           ob.printArray(arr);
       }
           
           
       }