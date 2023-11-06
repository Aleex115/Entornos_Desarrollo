/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays11;

import java.util.Scanner;


/**
 *
 * @author DAW
 */
public class Arrays11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        int pos=0,neg=0,neu =0;
        Scanner scan  = new Scanner(System.in);
        for(int i =0; i < array.length ; i++){
            System.out.println("Introduce un numero entero");
            array[i] = scan.nextInt();
            if(array[i] > 0){
                pos++;
            }else if(array[i] < 0){
                neg++;
            }else{
                neu++;
            }
        }
        System.out.println("Hay "+pos+" numeros mayores que 0");
        System.out.println("Hay "+neg+" numeros menores que 0");
        System.out.println("Hay "+neu+" numeros iguales que 0");
    }
    
}
