/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicioaprendizaje11;

import java.util.Scanner;

public class EjercicioAprendizaje11 {
    public static void main(String[] args) {
        int num1, num2, opcion;
        boolean salir;
        
        salir = false;         
          
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        num1 = entrada.nextInt();
        System.out.print("Ingresa otro número: ");
        num2 = entrada.nextInt();        
            
        while(!salir){
            
            System.out.println("");
            System.out.println("Bienvenido, ahora elige una opción a operar: "); //El menu dentro del while para se vuelva a mostrar
            System.out.println("");
        
            System.out.println("====MENU====");
            System.out.println("");
            System.out.println("1. Sumar");    
            System.out.println("2. Restar"); 
            System.out.println("3. Multiplicar"); 
            System.out.println("4. Dividir"); 
            System.out.println("5. Salir"); 
            System.out.println("");
            System.out.println("============");
        
            opcion = entrada.nextInt();            
        
            switch(opcion){
                case 1:
                    int suma = num1+num2;
                    System.out.println("La suma de los números ingresados es de: "+suma);
                    break;
                case 2:
                    int resta = num1-num2;
                    System.out.println("La resta de los números ingresados es de: "+resta);
                    break;
                case 3:
                    int multiplicacion = num1*num2;
                    System.out.println("La multiplicación de los números ingresados es de: "+multiplicacion);
                    break;
                case 4:
                    if(num2 != 0){ // porque todo numero dividido por cero da error
                        double division = num1/num2;
                        System.out.println("La división de los números ingresados es de: "+division);
                    }else{
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)?: ");
                    String S = entrada.next();
                    if(S.equals("S")){
                        salir = true;// true para que se salga del while
                        System.out.println("Gracias por visitarnos buen día.");           
                    }
                    break;                    
                default:
                    System.out.println("Opción no válida, vueve a intentarlo");
            }            
        }
    }    
}
