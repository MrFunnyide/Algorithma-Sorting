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
public class selectionSort {
    
    // field
    int x,i, j,min, temp, isiArray;
    int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    // construktor
    public selectionSort() {
        System.out.println("nilai array yang ada : ");
        cekarray(0);
        System.out.println("nilai array yan terurut adalah : ");
        sortingArray();
    }
    
    // method cek array
    public int cekarray(int x) {
        for (x = 0; x < array.length; x++) {
            isiArray = array[x];
            System.out.println(isiArray);
        }
        return x;
    }
    // method untuk sortng array
    public void sortingArray() {
        for (i = 0; i < array.length; i++) {
             min = i;
          
            for (j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            
            // swap nilai
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            System.out.println(array[i]);
            }
    }
    // method main untk jalankan program
    public static void main(String[] args) {
        new selectionSort();
    }
}
