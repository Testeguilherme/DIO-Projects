package teste;

import java.util.List;

public class RodaraAplicacao {
	
	
	public static void main(String[] args) {
		
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		for(ClasseMae i: classes) {
			i.metodo1();
		}
		
		System.out.println("");
		
		for(ClasseMae i: classes) {
			i.metodo2();
		}
		
	
		
	}

}
