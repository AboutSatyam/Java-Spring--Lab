package in.advance.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class RobustFileReader {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter The File Name : ");
		String name = Scan.next();
		// System.out.println("Current Directory: " + System.getProperty("user.dir"));

		try (FileReader reader = new FileReader(name)) {

			int read;
			while ((read = reader.read()) != -1) {
				System.out.print((char) read);
			}

		}

		catch (FileNotFoundException e) {

			System.out.printf("File Not Found :%s", name);

		} catch (IOException e) {

			// .printStackTrace();

			System.out.printf("Exception Got Occured :%s", e.getMessage()); // Catch Mai Delcaring At e
		}
		Scan.close(); // First Time USe
	}
}
