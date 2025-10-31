package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Id {
	
	private int MAX_LENGTH = 82;
	private String dir;
	private String idName;
	private List<String> numbers;
	
	public Id(String dir) {
		
		this.dir = dir;
		this.idName = "PicodeId";
		this.numbers = new ArrayList<>();
		
		// If id doesn't exist...
		if (!idExists()) {
			createNewId();
		}
		
		// Pull this id content into my numbers
		pullId();
	}

	public int getMAX_LENGTH() {
		return MAX_LENGTH;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public List<String> getNumbers() {
		return numbers;
	}
	
	public boolean idExists() {
		
		return new File(dir + "\\" + idName + ".txt").exists();
	}
	
	public void createNewId() {
		
		if (idExists() == false) {
		
			try (BufferedWriter bw = new BufferedWriter (new FileWriter(dir + "\\" + idName + ".txt"))){
				
				Random rand = new Random();
				List <Integer> noReps = new ArrayList<>(); 
				
				for (int i = 0; i < MAX_LENGTH; i++) {
					
					int x = rand.nextInt(1, 100);
					
					while (noReps.contains(x)) {
						x = rand.nextInt(1, 100);
					}
					
					if (x > 9) {
						bw.write(String.valueOf(x));
					}
					else {
						bw.write(String.valueOf("0" + x));	
					}
					noReps.add(x);
					bw.newLine();
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private void pullId() {
		
		if (idExists()) {
			
			try (BufferedReader br = new BufferedReader (new FileReader(dir + "\\" + idName + ".txt"))){
				
				for (int i = 0; i < MAX_LENGTH; i++) {
					numbers.add(br.readLine());
				}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}	
		}	
	}
	
	public boolean isThereThisNumber(int number) {
		
		for(int i = 0; i < MAX_LENGTH; i++) {
			
			if (numbers.get(i).equals(number)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		
		String id = "";
		
		for (String s : numbers) {
			id += s;
		}
		
		return id;
	}
}
