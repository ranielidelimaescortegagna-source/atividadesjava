import java.util.Scanner;  

public class atividade5 {

    public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();
		
		int dias = idade*365;
		
		System.out.print("dias: " + dias);
		
	}     
}
        
