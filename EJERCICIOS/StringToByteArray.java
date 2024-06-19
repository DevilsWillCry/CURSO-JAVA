package Ejercicios_Java;
import java.util.Arrays;
import java.nio.charset.Charset;
public class StringToByteArray {

	public static void main(String[] args) {
		String str = "HOLA";
		Charset charset = Charset.forName("UTF-8");
		byte[] byteArr = str.getBytes(charset);
		System.out.println(byteArr);
		// print the byte[] elements
		System.out.println("String to byte array: " + Arrays.toString(byteArr));
		String str_byte = new String(byteArr);
		System.out.println(str_byte);
	}
}