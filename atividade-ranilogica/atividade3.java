import java.util.Scanner;  

public class atividade3 {

    public static void main(String[] args) {
	    int numeroUm;
		int numeroDois;
		int numeroTres;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe 3 notas: ");
        numeroUm = entrada.nextInt();
		numeroDois = entrada.nextInt();
		numeroTres = entrada.nextInt();
		
		double media = (numeroUm + numeroDois + numeroTres)/3;
		
		System.out.print("media: " + media);
		
	}     
}
        
