package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import entities.Id;
import entities.Picode;

public class Program {

	public static void main(String[] args) {
		
		/*	
			██████   ██  ██████  ██████  ██████  ███████ 
			██   ██ ███ ██      ██  ████ ██   ██ ██      
			██████   ██ ██      ██ ██ ██ ██   ██ ███████ 
			██       ██ ██      ████  ██ ██   ██      ██ 
			██       ██  ██████  ██████  ██████  ███████                                                                                                                                              
		*/
		
		cleanScreen();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("██████   ██  ██████  ██████  ██████  ███████");
		System.out.println("██   ██ ███ ██      ██  ████ ██   ██ ██     ");
		System.out.println("██████   ██ ██      ██ ██ ██ ██   ██ ███████");
		System.out.println("██       ██ ██      ████  ██ ██   ██      ██");
		System.out.println("██       ██  ██████  ██████  ██████  ███████");
		System.out.println("               - by Pierry -                ");
		
		System.out.println();
		
		System.out.println("press enter to continue...");
		sc.nextLine();
		
		try {

		cleanScreen(30);
		
		System.out.print("Dir: ");
		String dir = sc.nextLine();
		
		Picode pc = new Picode(new Id(dir));
		
		System.out.println();
		
		program(sc, pc, true);
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void program(Scanner sc, Picode pc, boolean run) throws IOException {
		
		while (run) {
			cleanScreen(30);
			System.out.println(" # Options # ");
			System.out.println("Encoder --- 1");
			System.out.println("Decoder --- 2");
			System.out.println("See id ---- 3");
			System.out.println("Read file - 4");
			System.out.println("Leave ----- 5");
			System.out.print  ("N: -------- ");
			int n = sc.nextInt();
			
			sc.nextLine();
			
			switch (n) {
			
				case 1:
					cleanScreen(30);
					System.out.println("# ENCODER #");
					System.out.println();
					System.out.print("Text: ");
					String txt = sc.nextLine();
				
					System.out.println();
					
					String code = pc.encoder(txt);
					System.out.println("Code: " + code);
					
					System.out.println();
					
					System.out.println(" Save? ");
					System.out.println("Yes - 1");
					System.out.println("Not - 2");
					System.out.print("N: -- ");
					int save = sc.nextInt();
				
					if (save == 1) {
						
						sc.nextLine();
						
						System.out.println();
						
						System.out.print("File dir: ");
						String fileDir = sc.nextLine();
						
						System.out.print("File name: ");
						String fileName = sc.nextLine();
						
						pc.saveCode(txt, fileName, fileDir);
						
						System.out.println();
						
						System.out.println("Archive saved sucessfully!");
						
						sc.nextLine();
					}
					
				break;
				
				case 2:
					cleanScreen(30);
					System.out.println("# DECODER #");
					
					System.out.println();
					System.out.print("Code: ");
					String code2 = sc.nextLine();
				
					System.out.println();
					
					String txt2 = pc.decoder(code2);
					System.out.println("Text: " + txt2);
					
					sc.nextLine();
				break;
				
				case 3:
					cleanScreen(30);
					System.out.println("# ID #");
					System.out.println();
					System.out.println(pc);
					
					sc.nextLine();
				break;
				
				case 4:
					cleanScreen(30);
					System.out.println("# READ FILE #");
					
					System.out.println();
					
					System.out.print("File dir: ");
					String fileDir = sc.nextLine();
					
					System.out.print("File name: ");
					String fileName = sc.nextLine();
					
					if (new File(fileDir + "\\" + fileName + ".txt").exists()) {
					
						BufferedReader br = new BufferedReader (new FileReader(fileDir + "\\" + fileName + ".txt"));
						
						System.out.println();
						
						String content = br.readLine();
						
						System.out.println("Content: " + content);
						
						System.out.println();
						
						System.out.println("Decode: " + pc.decoder(content));
						br.close();	
						
						sc.nextLine();
					}
					else {
						
						System.out.println();
						
						System.out.println("The archive does not exist!");
					
						sc.nextLine();
					}
					
				break;
				
				case 5:
					cleanScreen(30);
					System.out.println("# LEAVE #");
					System.out.println();
					run = false;
					System.out.println("PROGRAM FINISHED.");
				break;
			}
			System.out.println();
		}
		sc.close();
	}
	
	public static void cleanScreen (int size) {
		for (int i = 0; i<size; i++) {
			System.out.println();
		}
	}
	
	public static void cleanScreen () {
		for (int i = 0; i<30; i++) {
			System.out.println();
		}
	}
}
