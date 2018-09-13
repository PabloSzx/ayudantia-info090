package javaio;

import java.io.*;

public class InputStreamOutputStream {
	void leer() throws IOException {
		InputStream input = new FileInputStream("file.txt");

		int data;
		do {
			data = input.read();
			System.out.println(data + "/" + (char) data);
		} while (data != -1);

		input.close();
	}

	void leerBytes() throws IOException {
		InputStream input = new FileInputStream("file.txt");
		byte[] data = new byte[10];
		int bytesRead;
		do {
			bytesRead = input.read(data);
			System.out.println("-----");
			System.out.println("bytes leidos: " + bytesRead);
			for (int i = 0; i < bytesRead; i++) {
				System.out.print(data[i]);
			}
			System.out.print("\n");
			for (int i = 0; i < bytesRead; i++) {
				System.out.print((char) data[i]);
			}
			System.out.print("\n----\n");
		} while (bytesRead != -1);

		input.close();

	}

	void escribir() throws IOException {
		OutputStream output = new FileOutputStream("file.txt");
		output.write("Hello World".getBytes());
		output.close();
	}

	void escribirOverwrite() throws IOException {
		OutputStream output = new FileOutputStream("fileOverwrite.txt", false);
		output.write("Hello World".getBytes());
		output.close();
	}

	void escribirAppending() throws IOException {
		OutputStream output;
		output = new FileOutputStream("fileAppending.txt", false);
		output.write("Hello".getBytes());
		output.close();
		output = new FileOutputStream("fileAppending.txt", true);
		output.write(" World!".getBytes());
		output.close();
	}

	public static void main(String[] args) throws IOException {
		InputStreamOutputStream test = new InputStreamOutputStream();
		test.escribirAppending();
		test.leerBytes();
	}
}
