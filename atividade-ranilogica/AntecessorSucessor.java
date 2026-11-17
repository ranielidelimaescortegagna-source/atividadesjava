  import java.util.Scanner;  

public class AntecessorSucessor {

    public static void main(String[] args) {
	    int numeroUm;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu número: ");
        numeroUm = entrada.nextInt();
		int sucessor = numeroUm +1;
		int antecessor = numeroUm -1;
		 
		System.out.println("sucessor: " + sucessor);
		System.out.println("antecessor: " + antecessor);
		 
	}     
}
        
