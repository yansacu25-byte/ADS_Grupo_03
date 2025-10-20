/*
 Un hospital necesita procesar las consultas de pacientes. Por cada paciente 
se ingresan: número de historia clínica, edad, sexo y tipo de consulta 
(urgencia, control, general). El proceso termina cuando se ingrese un número 
de historia clínica igual a -1. Al finalizar, mostrar cuántas consultas fueron 
urgencias, controles y generales. 
 */
package sena.ejercicio_17;
import java.util.Scanner;
public class Ejercicio_17 {
    static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
        int Edad, Nhcl=0, Urg = 0, Con = 0, Gen = 0;
        String Sexo, TC;
        System.out.println("Ingrese el numero de la historia clinica");
        Nhcl = dato.nextInt();
        System.out.println("Ingrese la edad del paciente");
        Edad = dato.nextInt();
        dato.nextLine();
        System.out.println("Ingrese el sexo del paciente /femenino /masculino");
        Sexo = dato.nextLine();
        System.out.println("Ingrese el tipo de consulta /urgencia /control /general");
        TC = dato.nextLine();
        while (Nhcl !=-1) {
          System.out.println("Ingrese el numero de la historia clinica");
        Nhcl = dato.nextInt();
        if (TC.equalsIgnoreCase("urgencia")) {
                Urg++;
            } else if (TC.equalsIgnoreCase("control")) {
                    Con++;
            } else if (TC.equalsIgnoreCase("general")) {
                Gen++;
             } else {
                        System.out.println("El tipo de consulta no esta disponible");
                        break;
                    }
             
        if(Nhcl==-1){
            break;
        }
        System.out.println("Ingrese la edad del paciente");
        Edad = dato.nextInt();
        dato.nextLine();
        System.out.println("Ingrese el sexo del paciente /femenino /masculino");
        Sexo = dato.nextLine();
        System.out.println("Ingrese el tipo de consulta /urgencia /control /general");
        TC = dato.nextLine();    
        }
         System.out.println("La cantidad de consultas por urgencia fueron " + Urg);
            System.out.println("La cantidad de consultas por control fueron " + Con);
            System.out.println("La cantidad de consultas por general fueron " + Gen);
    }
}
