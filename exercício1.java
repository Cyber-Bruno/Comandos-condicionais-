import java.util.Scanner;

public class exerc�cio1 {

	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
        int x;
        
        System.out.println("Verifique se um n�mero esta entre 20 e 90");
        x = leitor.nextInt();
        
        if (x>=20 && x <=90) {
        	System.out.println("Este n�mero est� entre 20 e 90");
        }
        
}
	
}