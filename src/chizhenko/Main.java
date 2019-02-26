package chizhenko;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		File myFolder;

		System.out.println("Введине название каталога");
		name = sc.nextLine();
		sc.close();
		myFolder = new File(name);
		
		listFolders(myFolder);
	}
	
	public static void listFolders(File myFolder) {
		
		File [] files = myFolder.listFiles();
		
		for(File tempFile:files) {
			if (!tempFile.isFile()) {
				System.out.println(tempFile.getName());
				listFolders(tempFile);
			}
		}
		
	}

}
