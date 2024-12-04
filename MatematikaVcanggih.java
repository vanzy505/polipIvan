/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikav;

/**
 *
 * @author iv4nm
 */
public class MatematikaVcanggih extends MatematikaV {
      //  overload modulus 
    void modulus(double a ,double b , double c){
        hasilDouble = a % b % c;
        System.out.println("Hasil Modulus: " + hasilDouble);
    }
    void modulus(int a ,int b , int c){
        hasilInt = a % b % c;
        System.out.println("Hasil Modulus: " + hasilInt);
    }
    void modulus(int a ,int b){
        hasilInt = a % b;
        System.out.println("Hasil Modulus: " + hasilInt);
    }
    void modulus(double a ,double b){
        hasilDouble = a % b ;
        System.out.println("Hasil Modulus: " + hasilDouble);
    }

    // Method operasiGabungan
    int operasiGabungan(int a , int b , int c){
        return a + (b * c);
    }
}
