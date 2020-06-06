/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivos;

import java.util.Scanner;

/**
 *
 * @author jamsr
 */
public class TareaRectangulo {
// AREA Y PERIMETRO DE UN RECTANGULO
    
// En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, 
//para ello deberemos crear las siguientes variables:

//alto (int)
//ancho (int)

//El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el 
//siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):

//Proporciona el alto:
//Proporciona el ancho:
//Area: <area>
//Perimetro: <perimetro>
    
//Las fórmulas para calcular el área y el perímetro de un Rectángulo son:
//Área: alto * ancho
//Perímetro: (alto + ancho) * 2
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Proporciona el alto: ");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho: ");
        int ancho = Integer.parseInt(scanner.nextLine());
               
        System.out.println("Area: " + (alto * ancho));
        System.out.println("Perimetro: " + (alto + ancho) * 2);
       
    }
}
