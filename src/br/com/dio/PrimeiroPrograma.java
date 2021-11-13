package br.com.dio;

import br.com.dio.model.Gato; // CTRL+SHIFT+O - faz a importação automática da class usada
//CTRL+D - APAGA A LINHA
//CTRL+M - EXIBE/SOME O MENU
//CTRL+SHIFT+F - ARRUMA A DOCUMENTAÇÃO
 
public class PrimeiroPrograma {
	  
	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		/* int a = 3;
		int b = 2;
		System.out.println("Hello World! " + (a+b));*/
	}

}
 
class Livros{
	private String nome; 
	private String npag;
}