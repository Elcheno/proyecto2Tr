package grupo4.testXML;

import java.io.File;
import java.io.IOException;

import grupo4.Utils.XMLManager;

public class TestPersona {

	public static void main(String[] args) {
		
		/*File f = new File("Persona.xml");
		if(f.exists()) {
			System.out.println("Existe");
			if(f.isDirectory()) {
				File[] files = f.listFiles();
				for(File file:files) {
					if(file.isDirectory()) {
						System.out.println("D-->"+file.getName());
					}else {
						System.out.println(file.getName());
					}
				}
			}
		}else {
			System.out.println("No existe");
			try {
				if(f.createNewFile()) {
					System.out.println("Creado ok");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Persona p = new Persona("1234A", "Ruben", 1234, "a@");
		if(XMLManager.writeXML(p, "Persona.xml")) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		
		Persona p1 = XMLManager.readXML(new Persona(), "Persona.xml");
		if(p1!=null) {
			System.out.println(p1);
		}else {
			System.out.println("KO");
		}*/
		
	}

}
