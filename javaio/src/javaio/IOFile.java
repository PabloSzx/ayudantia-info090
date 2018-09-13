package javaio;

import java.io.*;

public class IOFile {

    void fileExiste() throws IOException {
        File file = new File("file.txt");
        if (file.isFile()) {
            boolean fileExists = file.exists();
            System.out.println("file.txt " + (fileExists ? "si" : "no") + " existe");
        }
    }

    void crearCarpetaSiNoExiste() throws IOException {
        File file = new File("carpeta/test");
        if (file.isDirectory()) {
            boolean dirCreated = file.mkdirs();
            System.out.println("carpeta/test " + (dirCreated ? "si" : "no") + " fue necesario de crear");
        }
    }

    void largoArchivo() throws IOException {
        File file = new File("file.txt");
        long length = file.length();
        System.out.println("el archivo " + file.getName() + " tiene un largo de " + length + " bytes");
    }

    void cambiarNombreOMover() throws IOException {
        File file = new File("file.txt");
        boolean success = file.renameTo(new File("fileCambiado.txt"));
        System.out.println("el archivo " + file.getName() + (success ? " si" : " no") + " fue renombrado");
    }

    void eliminar() throws IOException {
        File file = new File("fileCambiado.txt");
        boolean success = file.delete();
        System.out.println("el archivo " + file.getName() + (success ? " si" : " no") + " fue eliminado");
    }

    void listaArchivos() throws IOException {
        File file = new File("./");
        if (file.isDirectory()) {
            for (String var : file.list()) {
                System.out.println(var);
            }
            File[] files = file.listFiles();
        }
    }

    public static void main(String[] args) throws IOException {
        IOFile file = new IOFile();
        file.fileExiste();
        file.crearCarpetaSiNoExiste();
        file.largoArchivo();
        file.cambiarNombreOMover();
        file.eliminar();
        file.listaArchivos();

    }
}