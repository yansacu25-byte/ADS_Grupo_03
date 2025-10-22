/*Crea un programa que permita calcular la propina de varios clientes en un
restaurante. Por cada cliente, se debe ingresar el valor de la cuenta y el
porcentaje de propina que desea dejar. El programa debe calcular y mostrar
la propina individual. Al final, muestra el total de propinas recolectadas
durante el turno. 
 */
package sena.examen_grupo_03_punto_2;

import java.util.Scanner;

public class Examen_Grupo_03_punto_2 {

    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        float Vc, Pp, Pi, Tpt = 0;
        String pregunta = " ";
        do {
            System.out.println("Ingrese el valor de la cuenta");
            Vc = dato.nextFloat();
            System.out.println("Ingrese el porcentaje de la propina que desea dejar");
            Pp = dato.nextFloat();
            Pi = ((Vc * Pp) / 100);
            System.out.println("Su propina es " + Pi);

        } 
        while (pregunta.equalsIgnoreCase("si"));
            Tpt = Tpt + Pi;
            System.out.println("Ingrese el valor de la cuenta");
            Vc = dato.nextFloat();
            System.out.println("Ingrese el porcentaje de la propina que desea dejar");
            Pp = dato.nextFloat();
            Pi = ((Vc * Pp) / 100);
            System.out.println("Su propina es " + Pi);
        }
        System.out.println("el total de su propinas recolectadas en su turno fueron " + Tpt);
    }
}
