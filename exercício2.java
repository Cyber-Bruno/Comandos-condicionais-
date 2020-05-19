import java.util.Scanner;

public class exercício2 {
	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
        int x;
        
        
        System.out.println("Verifique a classe que pertence digitando sua idade");
        x = leitor.nextInt();
        
        
        if (x>=5 && x<=10   ) {
        System.out.println("Infantil ");
	}
	  if(x>=11 && x <=17 ) {
        System.out.println("Juvenil");    
}
	 if(x >= 18){
		 System.out.println("Adulto");    
	}
	
}
}