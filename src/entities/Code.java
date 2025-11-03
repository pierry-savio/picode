package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Code {

	private String txt;
	private String name;
	private String codeDir;
	private Id id;
	private String dateTime;
	private String code;

	
	public Code (Id id) throws IOException {
		this.codeDir = id.getDir();
		this.id = id;
	}
	
	public Code (String txt, String name, Id id) throws IOException {
		this.txt = txt;
		this.name = name;
		this.codeDir = id.getDir();
		this.id = id;
		
		this.code = encoder(txt);
	}
	
	public Code (String txt, String name, String codeDir, Id id) throws IOException {
		this.txt = txt;
		this.name = name;
		this.code = codeDir;	
		this.id = id;
		
		this.code = encoder(txt);
	}
	
	public Code (String txt, String name, String codeDir, Id id, String dateTime, String code) throws IOException {
		this.txt = txt;
		this.name = name;
		this.code = codeDir;	
		this.id = id;
		this.dateTime = dateTime;
		this.code = code;
	}

	public String getTxt() {
		return txt;
	}
	
	public String getName() {
		return name;
	}

	public String getCodeDir() {
		return codeDir;
	}

	public Id getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getDateTime() {
		return dateTime;
	}
	
	public String encoder(String txt){
		
		Random r = new Random();
        
		txt = txt.toLowerCase();
		
		//Character real number
		String n1 = "";
		//Random number
		int n2 = 0;
		//Real number - Random number
		int n3 = 0;
		
		//date time of now formatted
		if (dateTime == null) {
			dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss"));
		}
		
		txt = dateTime + ": " + txt;
		
		//n2 and n3
		String code = "";
		
		for (int i = 0; i < txt.length(); i++) {
			
			switch(txt.charAt(i)) {
			
				case 'a':
					n1 = id.getNumbers().get(0);
				break;
				
				case 'b':
					n1 = id.getNumbers().get(1);
				break;
				
				case 'c':
					n1 = id.getNumbers().get(2);
				break;
				
				case 'ç':
					n1 = id.getNumbers().get(3);
				break;
				
				case 'd':
					n1 = id.getNumbers().get(4);
				break;
				
				case 'e':
					n1 = id.getNumbers().get(5);
				break;
				
				case 'f':
					n1 = id.getNumbers().get(6);
				break;
				
				case 'g':
					n1 = id.getNumbers().get(7);
				break;
				
				case 'h':
					n1 = id.getNumbers().get(8);
				break;
				
				case 'i':
					n1 = id.getNumbers().get(9);
				break;
				
				case 'j':
					n1 = id.getNumbers().get(10);
				break;
				
				case 'k':
					n1 = id.getNumbers().get(11);
				break;
				
				case 'l':
					n1 = id.getNumbers().get(12);
				break;
				
				case 'm':
					n1 = id.getNumbers().get(13);
				break;
				
				case 'n':
					n1 = id.getNumbers().get(14);
				break;
				
				case 'o':
					n1 = id.getNumbers().get(15);
				break;
				
				case 'p':
					n1 = id.getNumbers().get(16);
				break;
				
				case 'q':
					n1 = id.getNumbers().get(17);
				break;
				
				case 'r':
					n1 = id.getNumbers().get(18);
				break;
				
				case 's':
					n1 = id.getNumbers().get(19);
				break;
				
				case 't':
					n1 = id.getNumbers().get(20);
				break;
				
				case 'u':
					n1 = id.getNumbers().get(21);
				break;
				
				case 'v':
					n1 = id.getNumbers().get(22);
				break;
				
				case 'w':
					n1 = id.getNumbers().get(23);
				break;
				
				case 'x':
					n1 = id.getNumbers().get(24);
				break;
				
				case 'y':
					n1 = id.getNumbers().get(25);
				break;
				
				case 'z':
					n1 = id.getNumbers().get(26);
				break;
				
				case '0':
					n1 = id.getNumbers().get(27);
				break;
				
				case '1':
					n1 = id.getNumbers().get(28);
				break;
				
				case '2':
					n1 = id.getNumbers().get(29);
				break;
				
				case '3':
					n1 = id.getNumbers().get(30);
				break;
				
				case '4':
					n1 = id.getNumbers().get(31);
				break;
				
				case '5':
					n1 = id.getNumbers().get(32);
				break;
				
				case '6':
					n1 = id.getNumbers().get(33);
				break;
				
				case '7':
					n1 = id.getNumbers().get(34);
				break;
				
				case '8':
					n1 = id.getNumbers().get(35);
				break;
				
				case '9':
					n1 = id.getNumbers().get(36);
				break;
				
				case '\'':
					n1 = id.getNumbers().get(37);
				break;
				
				case '\"':
					n1 = id.getNumbers().get(38);
				break;
				
				case '!':
					n1 = id.getNumbers().get(39);
				break;
				
				case '@':
					n1 = id.getNumbers().get(40);
				break;
				
				case '#':
					n1 = id.getNumbers().get(41);
				break;
				
				case '$':
					n1 = id.getNumbers().get(42);
				break;
				
				case '%':
					n1 = id.getNumbers().get(43);
				break;
				
				case '&':
					n1 = id.getNumbers().get(44);
				break;
				
				case '*':
					n1 = id.getNumbers().get(45);
				break;
				
				case '(':
					n1 = id.getNumbers().get(46);
				break;
				
				case ')':
					n1 = id.getNumbers().get(47);
				break;
				
				case '-':
					n1 = id.getNumbers().get(48);
				break;
				
				case '+':
					n1 = id.getNumbers().get(49);
				break;
				
				case '=':
					n1 = id.getNumbers().get(50);
				break;
				
				case '/':
					n1 = id.getNumbers().get(51);
				break;
				
				case '[':
					n1 = id.getNumbers().get(52);
				break;
				
				case ']':
					n1 = id.getNumbers().get(53);
				break;
				
				case '{':
					n1 = id.getNumbers().get(54);
				break;
				
				case '}':
					n1 = id.getNumbers().get(55);
				break;
				
				case '|':
					n1 = id.getNumbers().get(56);
				break;
				
				case ',':
					n1 = id.getNumbers().get(57);
				break;
				
				case '.':
					n1 = id.getNumbers().get(58);
				break;
				
				case ';':
					n1 = id.getNumbers().get(59);
				break;
				
				case '<':
					n1 = id.getNumbers().get(60);
				break;
				
				case '>':
					n1 = id.getNumbers().get(61);
				break;
				
				case ':':
					n1 = id.getNumbers().get(62);
				break;
				
				case '?':
					n1 = id.getNumbers().get(63);
				break;
				
				case 'á':
					n1 = id.getNumbers().get(64);
				break;
				
				case 'à':
					n1 = id.getNumbers().get(65);
				break;
				
				case 'ã':
					n1 = id.getNumbers().get(66);
				break;
				
				case 'â':
					n1 = id.getNumbers().get(67);
				break;
				
				case 'é':
					n1 = id.getNumbers().get(68);
				break;
				
				case 'è':
					n1 = id.getNumbers().get(69);
				break;
				
				case 'ê':
					n1 = id.getNumbers().get(70);
				break;
				
				case 'í':
					n1 = id.getNumbers().get(71);
				break;
				
				case 'ì':
					n1 = id.getNumbers().get(72);
				break;
				
				case 'î':
					n1 = id.getNumbers().get(73);
				break;
				
				case 'ó':
					n1 = id.getNumbers().get(74);
				break;
				
				case 'ò':
					n1 = id.getNumbers().get(75);
				break;
				
				case 'õ':
					n1 = id.getNumbers().get(76);
				break;
				
				case 'ô':
					n1 = id.getNumbers().get(77);
				break;
				
				case 'ú':
					n1 = id.getNumbers().get(78);
				break;
				
				case 'ù':
					n1 = id.getNumbers().get(79);
				break;
				
				case 'û':
					n1 = id.getNumbers().get(80);
				break;
				
				case ' ':
					n1 = id.getNumbers().get(81);
				break;
				
				default:
					n1 = id.getNumbers().get(63);
				break;
			}

			//if n1 = 1, n2 must be 0 
			if (Integer.valueOf(n1) < 2) {
				n2 = 0;
				n3 = Integer.valueOf(n1) - n2;
			}
			else {
				n2 = r.nextInt(1, Integer.valueOf(n1));
				
				n3 = Integer.valueOf(n1) - n2;
				
				while (n2 + n3 != Integer.valueOf(n1)) {
					n2 = r.nextInt(1, Integer.valueOf(n1));
				}
			}
			
			//Add 0 if any of the numbers is smaller than 10
			if (n2 > 9 && n3 > 9) {
				code += n2 + "" + n3;
			}
			else if (n2 < 10 && n3 > 9) {
				code += "0" + n2 + "" + n3;
			}
			else if (n2 > 9 && n3 < 10) {
				code += n2 + "0" + n3;
			}
			else if (n2 < 10 && n3 < 10) {
				code += "0" + n2 + "0" + n3;
			}
		}
		
		return code;
	}
	
	public String decoder(String code){
		
		int sum = 0;
		String surfaceCode = "";
		String txt = "";
		
		//deep code ---> surface code
		
		for (int i = 0; i < code.length() / 4; i++) {
			
			String n2 = code.substring(i*4, i*4+2);
			String n3 = code.substring(i*4+2, i*4+4);
			sum = Integer.valueOf(n2) + Integer.valueOf(n3);
			
			if (sum > 9) {
				surfaceCode += sum;
			}
			else {
				surfaceCode += "0" + "" + sum;
			}
		}
		
		//surface code ---> text
		
		for (int i = 0; i < surfaceCode.length() / 2; i++) {
			
			String n1 = surfaceCode.substring(i*2, i*2+2);
			
			switch (id.getNumbers().indexOf(n1)) {
			
				case 0:
					txt += "a";
				break;
				
				case 1:
					txt += "b";
				break;
				
				case 2:
					txt += "c";
				break;
				
				case 3:
					txt += "ç";
				break;
				
				case 4:
					txt += "d";
				break;
				
				case 5:
					txt += "e";
				break;
				
				case 6:
					txt += "f";
				break;
				
				case 7:
					txt += "g";
				break;
				
				case 8:
					txt += "h";
				break;
				
				case 9:
					txt += "i";
				break;
				
				case 10:
					txt += "j";
				break;
				
				case 11:
					txt += "k";
				break;
				
				case 12:
					txt += "l";
				break;
				
				case 13:
					txt += "m";
				break;
				
				case 14:
					txt += "n";
				break;
				
				case 15:
					txt += "o";
				break;
				
				case 16:
					txt += "p";
				break;
				
				case 17:
					txt += "q";
				break;
				
				case 18:
					txt += "r";
				break;
				
				case 19:
					txt += "s";
				break;
				
				case 20:
					txt += "t";
				break;
				
				case 21:
					txt += "u";
				break;
				
				case 22:
					txt += "v";
				break;
				
				case 23:
					txt += "w";
				break;
				
				case 24:
					txt += "x";
				break;
				
				case 25:
					txt += "y";
				break;
				
				case 26:
					txt += "z";
				break;
				
				case 27:
					txt += "0";
				break;
				
				case 28:
					txt += "1";
				break;
				
				case 29:
					txt += "2";
				break;
				
				case 30:
					txt += "3";
				break;
				
				case 31:
					txt += "4";
				break;
				
				case 32:
					txt += "5";
				break;
				
				case 33:
					txt += "6";
				break;
				
				case 34:
					txt += "7";
				break;
				
				case 35:
					txt += "8";
				break;
				
				case 36:
					txt += "9";
				break;
				
				case 37:
					txt += "'";
				break;
				
				case 38:
					txt += "\"";
				break;
				
				case 39:
					txt += "!";
				break;
				
				case 40:
					txt += "@";
				break;
				
				case 41:
					txt += "#";
				break;
				
				case 42:
					txt += "$";
				break;
				
				case 43:
					txt += "%";
				break;
				
				case 44:
					txt += "&";
				break;
				
				case 45:
					txt += "*";
				break;
				
				case 46:
					txt += "(";
				break;
				
				case 47:
					txt += ")";
				break;
				
				case 48:
					txt += "-";
				break;
				
				case 49:
					txt += "+";
				break;
				
				case 50:
					txt += "=";
				break;
				
				case 51:
					txt += "/";
				break;
				
				case 52:
					txt += "[";
				break;
				
				case 53:
					txt += "]";
				break;
				
				case 54:
					txt += "{";
				break;
				
				case 55:
					txt += "}";
				break;
				
				case 56:
					txt += "|";
				break;
				
				case 57:
					txt += ",";
				break;
				
				case 58:
					txt += ".";
				break;
				
				case 59:
					txt += ";";
				break;
				
				case 60:
					txt += "<";
				break;
				
				case 61:
					txt += ">";
				break;
				
				case 62:
					txt += ":";
				break;
				
				case 63:
					txt += "?";
				break;
				
				case 64:
					txt += "á";
				break;
				
				case 65:
					txt += "à";
				break;
				
				case 66:
					txt += "ã";
				break;
				
				case 67:
					txt += "â";
				break;
				
				case 68:
					txt += "é";
				break;
				
				case 69:
					txt += "è";
				break;
				
				case 70:
					txt += "ê";
				break;
				
				case 71:
					txt += "í";
				break;
				
				case 72:
					txt += "ì";
				break;
				
				case 73:
					txt += "î";
				break;
				
				case 74:
					txt += "ó";
				break;
				
				case 75:
					txt += "ò";
				break;
				
				case 76:
					txt += "õ";
				break;
				
				case 77:
					txt += "ô";
				break;
				
				case 78:
					txt += "ú";
				break;
				
				case 79:
					txt += "ù";
				break;
				
				case 80:
					txt += "û";
				break;
				
				case 81:
					txt += " ";
				break;
				
				default:
					txt += "?";
				break;
			}
		}
		return txt;
	}
	
	public void saveCode(String name, String codeDir) throws IOException {
		
		this.name = name + ".txt";
		this.codeDir = codeDir;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(codeDir + "\\" + this.name));
		bw.write(code);
		bw.close();
	}
	
	@Override 
	public String toString() {
		return code;
	}
}
