package c.io.text;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Demo1 {

	public static void main(String[] args) {
		// The basic 4 abstract classes of IO API:

		// bytes input
		InputStream inBytes = null;
		// bytes output
		OutputStream outBytes = null;
		// character input
		Reader inChar = null;
		// character output
		Writer outChar = null;

		try {
			inBytes.read(); // ����� �� ����
			inChar.read(); // ����� �� ��
			outBytes.write(0); // ����� �� ����
			outChar.write(0); // ����� �� ��
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
