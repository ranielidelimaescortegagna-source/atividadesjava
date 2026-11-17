  import java.util.Scanner;  

public class atividade2 {

    public static void main(String[] args) {
	    int numeroUm;
		int numeroDois;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe 2 número: ");
        numeroUm = entrada.nextInt();
		numeroDois = entrada.nextInt();
		int soma = numeroDois + numeroUm;
		int sub = numeroUm - numeroDois;
		int mult = numeroUm * numeroDois;
		int div = numeroUm/numeroDois;
		System.out.print("Soma: " + soma + ", subtração: "  + sub + ", multiplicação " + mult + ", divisão: " + div);
		
	}     
}
        
