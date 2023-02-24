package listasExercicios;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploMap {

	public static void main(String[] args) {

		
		/* 
		 modelo = gol - consumo = 14.4 km/l
		 modelo = uno - consumo = 15.6 km/l
		 modelo = mobi - consumo = 16.1 km/l
		 modelo = hb20 - consumo = 14.5 km/l
		 modelo = kwid - consumo = 15.6 km/l
		 */

		System.out.println("Criar um dicionário que relacione o modelo e seus respectivos consumos!");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		
		System.out.println(carrosPopulares.toString());
		
		//SUBSTITUIR O CONSUMO DO GOL POR 15.2L
		carrosPopulares.put("gol", 15.2);
		
		//VERIFICAR SE EXISTE DETERMINADO MODELO NO DICIONÁRIO
		System.out.println(carrosPopulares.containsKey("uno")); 
		
		//EXIBIR CONSUMO DO UNO
		System.out.println("Consumo do uno: " + carrosPopulares.get("uno"));
		
		//EXIBIR TODOS OS MODELOS TIPO 1
		System.out.println("Modelos: " + carrosPopulares.keySet());
		
		//EXIBIR TODOS OS MODELOS TIPO 2
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println("Modelos: " + modelos);
		
		//EXIBIR TODOS OS CONSUMOS TIPO 1
		System.out.println("Consumo: " + carrosPopulares.values());
		
		//EXIBIR TODOS OS CONSUMOS TIPO 2
		Collection<Double> consumo = carrosPopulares.values();
		System.out.println("Consumo: " + consumo);
		
		//EXIBIR CARRO COM MELHOR CONSUMO
		System.out.println("Melhor eficiência: " + Collections.max(carrosPopulares.values()) + " km/l"); 
		
		//EXIBIR A SOMA DOS CONSUMOS
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Soma: " + soma);
		
		
		
		
		
		
		
		
		
		System.out.println(carrosPopulares.toString());
		
	}

}
