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
public class InsertionSort {
    // field
    int i, j, temp, simpan;
    int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    // construktor
    public InsertionSort() {    // menamping method yang ingin di jalankan
        System.out.println("Array Awal : ");
        cekArray(array);
        System.out.println("setelah di sorting menggunakan Insertion Sort : ");
        insrtionSort(array);
    }
    
    // method cek array
    void cekArray (int isiArray[]) {
        this.array = isiArray;
        for (i = 0; i < isiArray.length; i++) 
            System.out.println(isiArray[i]);
    }
    
    // method sorting
    void insrtionSort(int array[]) {
        int n = array.length;
        for (j = 0; j < n ; j++) {
           temp = array[j];
           simpan = j-1;
           while ((simpan > -1) && (array[simpan] > temp ) ) {
                array[simpan+1] = array[simpan];
                simpan--;
            }
           array[simpan + 1] = temp;
        }
        // panggil array yang telah di sorting
        for(i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    // method main
    public static void main(String[] args) {
        new InsertionSort();
    }
}
