import java.util.Scanner;  

public class atividade6 {

    public static void main(String[] args) {
		String nome;
		int idade;
		boolean ativa;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu nome de usuario: ");
        nome = entrada.nextLine();
		System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();
		System.out.print("Informe se sua conta ainda esta ativa (true ou false): ");
        ativa = entrada.nextBoolean();
	
		System.out.print("usuario: " + nome);
		System.out.print(", idade: " + idade);
		System.out.print(", conta ativa: " + ativa);
		
	}     
}
        
