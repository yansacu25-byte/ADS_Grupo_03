/*Un hospital necesita procesar las consultas de pacientes. Por cada paciente 
se ingresan: número de historia clínica, edad, sexo y tipo de consulta 
(urgencia, control, general). El proceso termina cuando se ingrese un número 
de historia clínica igual a -1. Al finalizar, mostrar cuántas consultas fueron 
urgencias, controles y generales.*/
package sena.ejercicio_17_2;

import java.util.Scanner;

public class Ejercicio_17_2 {

    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        int Edad, Hclp, Cont = 0, Urg = 0, Gen = 0;
        String Tc, Sexo;
        do {

            System.out.println("Ingrese la edad del paciente");
            Edad = dato.nextInt();
            dato.nextLine();
            System.out.println("Ingrese el sexo del paciente /femenino /masculino");
            Sexo = dato.nextLine();
            System.out.println("tipo de consulta: urgencia");
            System.out.println("tipo de consulta: control");
            System.out.println("tipo de consulta: general");

            System.out.println("seleccione tipo de consulta");

            Tc = dato.nextLine();

            switch (Tc) {
                case "control":
                    System.out.println("seleccione control");
                    Cont++;
                    break;
                case "urgengecia":
                    System.out.println("seleccione urgencia");
                    Urg++;
                    break;
                case "general":
                    System.out.println("seleccione general");
                    Gen++;
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente");

            }
            System.out.println("Ingrese el numero de la historia clinica");
            Hclp = dato.nextInt();
        } while (Hclp != -1);

        System.out.println("El total de paciente en consulta general es de " + Gen);
        System.out.println("El total de paciente en consulta control es de " + Cont);
        System.out.println("El total de paciente en consulta urgencias es de " + Urg);
    }
}
