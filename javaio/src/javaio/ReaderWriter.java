package javaio;

import java.io.*;

public class ReaderWriter {
	void leer() throws IOException {
		Reader reader = new FileReader("file2.txt");
		int data;
		do {
			data = reader.read();
			System.out.print(data != -1 ? (char) data : "\n");
		} while (data != -1);
		reader.close();
	}

	void leerString() throws IOException {
		Reader reader = new FileReader("file2.txt");
		char[] data = new char[5];
		int charRead;
		String str;
		do {
			charRead = reader.read(data);
			str = new String(data);
			System.out.println(str + " de largo: " + charRead);
		} while (charRead != -1);

		reader.close();
	}

	void escribir() throws IOException {
		Writer writer = new FileWriter("file2.txt");
		writer.write("Hello World Writer");
		writer.close();
	}

	public static void main(String[] args) throws IOException {
		ReaderWriter test = new ReaderWriter();
		test.escribir();
		test.leer();

		test.leerString();
	}
}
