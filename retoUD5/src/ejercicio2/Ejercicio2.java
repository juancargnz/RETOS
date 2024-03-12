package ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        System.out.println();
        puntoA();
       puntosBC();
    }

    public static void puntoA() throws IOException {
        // mostrar directorio actual
        System.getProperty("user.dir");

        // crear directorio:dirEjer2 (comprobar antes que existe)
        File directorio = new File("dirEjer2");
        if (directorio.exists()) {
            System.out.println("el directorio ya existe");
        } else {
            directorio.mkdir();
        }
        // crear dos ficheros uno.txt,dos.txt(comprobar que existe)
        File fileUno = new File("dirEjer2//uno.txt");
        File fileDos = new File("dirEjer2//dos.txt");
        if (fileUno.exists()) {
            System.out.println("El fichero: " + fileUno.getName() + "ya existe");
        } else {
            fileUno.createNewFile();
        }
        if (fileDos.exists()) {
            System.out.println("El fichero: " + fileDos.getName() + "ya existe");
        } else {
            fileDos.createNewFile();
        }
    }

    public static void puntosBC() {
        // pedir nombres hasta que el introducido sea solo:"-"
        String nombre;
        Scanner teclado = new Scanner(System.in);
        BufferedWriter escritor = null;
        File fileUno = new File("dirEjer2//uno.txt");

        try {
            do {
                System.out.println("introduce nombre por pantalla");
                System.out.println("introduce - para finalizar");
                nombre = teclado.nextLine();
                if (!nombre.equals("-")) {
                    escritor.write(nombre + "\n");
                }
            } while (nombre.equals("-"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            teclado.close();
        }
    }

    private static String fileUno(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fileUno'");
    }

}
