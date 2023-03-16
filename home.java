package a;
import java.util.*;
public class home {

	public static void main(String[] args) {
		//CRIAÇÃO DE VARIAVEIS
		double n1,n2,m;
		String nome;
		boolean maioridade;
		int idade;
		
		//CRIAR SCANNER PARA LER INFO
		Scanner scan = new Scanner(System.in);
		//DIGITE O PRIMEIRO NUMERO
		System.out.println("Digite o primeiro numero");
		n1 = scan.nextDouble();
		//DIGITE O SEGUNDO NUMERO
		System.out.println("Digite o segundo numero");
		n2 = scan.nextDouble();
		//DIGITE O NOME DO USUARIO
		System.out.println("Nome do usuario");
		nome = scan.next();
		//DIGITE A IDADE
		System.out.println("Digite a idade");
		//VERIFICAR MAIORIDADE
		idade = scan.nextInt();
		if (idade >= 18) {
			maioridade = true;
		}
		else {
			maioridade = false;
		}
		//FAZER MEDIA
		m = (n1 + n2)/2;
		//DIGITAR FRASE FINAL
		System.out.println("Caro senhor(a) " + nome +" a sua idade e de " +idade +" a sua media de nota e de " + m);
		//DEFINIR MAIORIDADE
		System.out.println("sua maioridade é " + maioridade);
		
		
		
		
		
	}

}
