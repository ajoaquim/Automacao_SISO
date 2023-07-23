package br.com.portoseguro.data.textreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TextReader {

	private static ArrayList<String> lines = new ArrayList<>();
	private static String filePath = "src/main/resources/files/PedidoEmAnalise.txt";

	public static String getLine() {

		String currentLine = null;

		if (lines.isEmpty()) {
			getContent();
		}

		for (int i = 0; i < lines.size(); i++) {
			if (!lines.get(i).contains("Massa Usada")) {
				lines.set(i, lines.get(i) + " Massa Usada");
				currentLine = lines.get(i);
				break;
			}
		}

		updateFile(filePath);

		return currentLine;
	}

	public static void saveText(String text) {
		if (lines.isEmpty()) {
			getContent();
		}
		lines.add(0, text);
		updateFile(filePath);
	}

	private static void getContent() {
		try {
			InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath));
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				if (!line.isEmpty()) {
					lines.add(line);
				}
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void updateFile(String filePath2) {
		try {

			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filePath2));
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			for (String string : lines) {
				bufferedWriter.write(string);
				bufferedWriter.newLine();
			}

			bufferedWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void saveText(String string, String replace) {
		if (lines.isEmpty()) {
			getContent();
		}
		lines.add(0, replace);
		updateFile(String.format("src/main/resources/files/%s.txt", string));
	}

}
