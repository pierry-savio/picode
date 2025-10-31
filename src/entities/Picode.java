package entities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Picode {

	private Id id;
	private List <Code> codes = new ArrayList<>();
	
	public Picode(Id id) {
		this.id = id;
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
