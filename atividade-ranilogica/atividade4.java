import java.util.Scanner;  

public class atividade4 {

    public static void main(String[] args) {
		double metros;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um valor em metros: ");
        metros = entrada.nextInt();
		
		double centimetros = metros*100;
		
		System.out.print("centimetros: " + centimetros);
		
	}     
}
        
