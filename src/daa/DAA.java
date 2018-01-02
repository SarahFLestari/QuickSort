/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daa;

/**
 *
 * @author 
 */
public class DAA {
private static void QuickSort(int[] arr, int kiri,int kanan){
        int index =partisi(arr, kiri, kanan);
        //Untuk mengetahui nilai index
        //System.out.println("ini index : "+index);
        if(kiri < index -1)
            QuickSort(arr, kiri, index -1);
            //untuk mengetahui nilai kiri
            //System.out.println(kiri);
        if(index < kanan)
            QuickSort(arr,index,kanan);
            //untuk mengetaui nilai kanan
            //System.out.println(kanan);
}
 private static int partisi(int[] arr, int kiri, int kanan){
        int pivot = arr[(kiri+kanan) / 2];
        //untuk mengetahui nilai pivot
        //System.out.println("ini pivot :"+pivot);
        while (kiri <= kanan){
            //untuk mengetahui nilai kiri dan kanan yang kanan
            //System.out.println("pembanding"+kiri+kanan);
            while(arr[kiri] < pivot){
                kiri++;
            }
            while(arr[kanan]>pivot){
                kanan--;
            }
                if (kiri <= kanan){
                    int tmp = arr[kiri];
                    arr[kiri] = arr[kanan];
                    arr[kanan]=tmp;

                    kiri++;
                    kanan--;
            }
        //untuk mengetahui nilai akhir kiri dan kanan
        //System.out.println("akhir kiri"+kiri);
        //System.out.println("akhir kanan"+kanan);
        }
        return kiri;
    }
    public static void main(String[] args){
        int[]arr = new int[]{10,19,5,21,4,51,61,3,2,1};
        //kiri = 0, kanan 10-1= 9
        QuickSort(arr, 0,arr.length - 1);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
        
    }


