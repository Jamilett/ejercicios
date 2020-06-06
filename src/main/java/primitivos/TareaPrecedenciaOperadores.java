/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivos;

/**
 *
 * @author jamsr
 */
public class TareaPrecedenciaOperadores {
    public static void main(String[] args) {
        
        int a = 2;
        int b = 3;
        // OPERACION A EVALUAR: -3 + 6 / ++a * 4 - b-- + b       
        
        int operacion01 = 6 / ++a; // //Se evalua: 6 / ++a (donde 'a' se preincrementa y vale 3)
        System.out.println("operacion01 = " + operacion01); //Imprime 2
        int operacion02 = operacion01 * 4; //Se evalua: 2 * 4
        System.out.println("operacion02 = " + operacion02); //Imprime 8
        int operacion03 = - 3 + operacion02; //Se evalua -3 + 8
        System.out.println("operacion03 = " + operacion03); //Imprime 5
        int operacion04 = operacion03 - b--; //Se evalua 5 - b-- (donde b primero se asigna 3, y luego se decrementa)
        System.out.println("operacion04 = " + operacion04); //Imprime 2
        int operacion05 = operacion04 + b; //Se evalua 2 + b (teniamos pendiente un decremento de b, vale 2)
        System.out.println("operacion05 = " + operacion05);//imprime 4
        
        //Agrupando con parentesis tenemos:
        //Recordar que las expresiones se evaluan de izquierda a derecha
        //y se comienza a agrupar aplicando la precedencia de operadores
        //int res2 = ((-3 + ((6 / ++a) * 4)) - b--) + b;

        int res = -3 + 6 / ++a * 4 - b-- + b;
        // 6/3=2 *4= 8, -3 + 8 = 5 -3=2 + 2= 4
            }
    
}
