package br.ufpe.cin.if688.jflex;

import java.io.File;

/* Após implementar as suas regras léxicas no arquivo Minijava.jflex que está em src/main/resources, rode essa classe "Gerador"
   e então a classe Minijava será gerada na pasta resources.
 */
/* Não há necessidade de alterar nada nesta classe, apenas roda-la. */

public class Gerador {
		public static void main(String[] args) {
			String loginAluno = "MiniJava";
			String path = "src/main/resources/";   
			String arquivo = path + loginAluno + ".jflex";    
			File file = new File(arquivo);	
			jflex.Main.generate(file);	
		}
	}
