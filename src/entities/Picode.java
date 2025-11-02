package entities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Picode {

	private Id id;
	private List <Code> codes = new ArrayList<>();
	
	public Picode(Id id) throws IOException {
		this.id = id;
		pullCodes();
	}
	
	public Id getId() {
		return id;
	}
	
	public void setId(Id id) {
		this.id = id;
	}
	
	public List<Code> getCodes() {
		return codes;
	}

	public void pullCodes() throws IOException {
		
		File pasta = new File(id.getDir());

        for (File f : pasta.listFiles()) {
            if (f.isFile() && f.getName().endsWith(".txt") && !f.getName().equals("PicodeId.txt")) {

                String code = Files.readString(f.toPath());

                String dateTime = code.length() >= 92 ? code.substring(0, 92) : code;

                Code codeObj = new Code(new Code(id).decoder(code), f.getName(), f.getAbsolutePath(), id, dateTime, code);

                this.codes.add(codeObj);
            }
        }
	}
	
	public void saveCode (String txt, String name, String codeDir) throws IOException {
		
		Code code = new Code(txt, name, codeDir, id);
		code.saveCode(name, codeDir);
		
		codes.add(code);
	}
	
	public String encoder (String txt) throws IOException {
		return new Code(id).encoder(txt);
	}
	
	public String decoder (String code) throws IOException {
		return new Code(id).decoder(code);
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
}
