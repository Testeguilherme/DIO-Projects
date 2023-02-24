package listasExercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
		// [7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6]
		
		List<Double> notas = new ArrayList<Double>();
		
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas.toString());
		
		//RETORNA A POSIÇÃO ESPECÍFICA DO ITEM
		notas.indexOf(5.0);
		
		//ADICIONAR UM ITEM NUMA POSIÇÃO ESPECÍFICA(POSIÇÃO, ELEMENTO)
		notas.add(4, 8.0);
		
		//SUBSTITUIR UMA NOTA PELA OUTRA (POSIÇÃO, ELEMENTO)
		notas.set(notas.indexOf(5.0), 6.0);
		
		//VERIFICAR SE O ITEM EXISTE NA LISTA
		notas.contains(5d);
		
		//EXIBIR A NOTA DE UMA POSIÇÃO ESPECÍFICA
		notas.get(2);
		
		//EXIBIR A MENOR NOTA
		Double min = Collections.min(notas);
		System.out.println("Mínimo: " + min);
		
		//EXIBIR A MAIOR NOTA
		Double max = Collections.max(notas);
		System.out.println("Máximo: " + max);
		
		//EXIBIR A SOMA DOS VALORES
		double soma = 0;
		Iterator<Double> it = notas.iterator();
		while(it.hasNext()) {
			Double next = it.next();
			soma += next;
		}
		System.out.println("Soma: " + soma);
		
		//EXIBIR A MÉDIA DA LISTA(SOMA/QUANTIDADE DE ITENS)
		System.out.println("Média: " + soma/notas.size());
		
		//REMOVER UMA NOTA ESPECIFICA
		notas.remove(0d); //OU
		notas.remove(5);
		
		//REMOVER AS NOTAS MENORES QUE 7
		 Iterator<Double> itar = notas.iterator();
		 while(itar.hasNext()) {
			 Double next = itar.next();
			 if(next < 7) {
				 itar.remove();
			 }
		 }
		 
		 //APAGAR TODA A LISTA
		 //notas.clear();
		 
		 //VERIFICAR (TRUE/FALSO) SE A LISTA ESTÁ VAZIA
		 System.out.println("A lista está vazia? " + notas.isEmpty()); 
		 
		System.out.println(notas.toString());	
	}
}
