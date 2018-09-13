package javaio;

import java.io.*;

public class DataInputOutput {
    void escribir() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.txt"));
        dataOutputStream.writeInt(123);
        dataOutputStream.writeFloat(123.45F);
        dataOutputStream.writeLong(789);

        dataOutputStream.close();
    }

    void leer() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.txt"));

        int int123 = dataInputStream.readInt();
        System.out.println(int123);
        float float12345 = dataInputStream.readFloat();
        System.out.println(float12345);
        long long789 = dataInputStream.readLong();
        System.out.println(long789);

        dataInputStream.close();
    }

    public static void main(String[] args) throws IOException {
        DataInputOutput stream = new DataInputOutput();

        stream.escribir();
        stream.leer();

    }
}