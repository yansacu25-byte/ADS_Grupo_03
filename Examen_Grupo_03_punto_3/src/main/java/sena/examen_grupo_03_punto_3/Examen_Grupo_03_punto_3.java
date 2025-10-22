/*Desarrolla un programa que simule el funcionamiento de un cajero
automático. Debe iniciar con un saldo inicial definido y mostrar un menú con
las opciones: consultar saldo, consignar dinero, retirar dinero o salir.
 */
package sena.examen_grupo_03_punto_3;

import java.util.Scanner;

public class Examen_Grupo_03_punto_3 {

    static Scanner dato = new Scanner(System.in);

    public static void main(String[] args) {
        int Si = 100000, opc, Dc, res, Dr,sum=0;
        do {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consignar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("elija una opcion");
            opc = dato.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("El saldo de su cuenta es " + Si);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero que quiere consignar");
                    Dc = dato.nextInt();
                    res = Si + Dc;
                    sum=res+Si;
                    System.out.println("Su saldo es " + res);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dinero que quiere retirar");
                    Dr = dato.nextInt();
                    if (Si > Dr) {
                        res = Si - Dr;
                        System.out.println("Su saldo es " + res);
                    } else {
                        System.out.println("Su saldo es insuficiente consulte su saldo o ingrese otra cantidad");
                        break;
                    }
                case 4:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
            }
        } while (opc != 4);
    }
}
