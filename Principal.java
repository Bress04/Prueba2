package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        System.out.println("Dime numero de empleados");
        int num = teclado.nextInt();
        for (int i = 0; i < num; i++) {
            Empleado e = new Empleado("Nombre " + i, "Abcde " + i, 34 + i, false, 2000 + i * 100);
            lista.add(e);
            Programador p = new Programador(5000 + i + 200, "Java", "Nombre " + i, "Abcde " + i, 34 + i, false, 2000 + i * 100);
            lista.add(p);
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println();
            System.out.println(lista.get(i).toString());

        }

    }

}
