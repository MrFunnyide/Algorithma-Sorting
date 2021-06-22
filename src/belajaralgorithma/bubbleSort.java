/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaralgorithma;

/**
 *
 * @author HP
 */
public class bubbleSort {
    
    // field
    int i, j, k, temp;
    int[] isiArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
    // construktor

    public bubbleSort() {
        //tulis code di bawah
        System.out.println("Array Awal : ");
        arrayCheck();
        System.out.println("Array Di Urutkan mengunakan Bubble Sort :");
        sorting();
    }
    
    // method  untuk cek isi array
    public void arrayCheck() {
        for (i = 0; i < isiArray.length; i++) {
            System.out.println(isiArray[i]);
        }
    }
    
    // sorting menggunakan bubble sort
    public void sorting() {
         for(j = 0; j < isiArray.length-1; j++) {
             for (k = 0; k < isiArray.length - j - 1; k++) {
                 if (isiArray[k] > isiArray[k+1]) {
                     
                     // swap value
                     temp = isiArray[k];
                     isiArray[k] = isiArray[k+1];
                     isiArray[k+1] = temp;
                 }
             }
         }
         for (i = 0; i < isiArray.length; i++) {
            System.out.println(Integer.toString(isiArray[i]));
        }
    
    }
    // method main, untuk run
    public static void main(String[] args) {
        // pangil construktor
        new bubbleSort();
    }
}
