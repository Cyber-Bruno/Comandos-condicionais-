import java.util.Scanner;
public class exercício5 {

	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
       double w;
       double x;
       double y;
       double z;
       
       System.out.println("Leitor de matrícula");
       
       System.out.println("Primeiro valor");
       w = leitor.nextDouble();
       
       System.out.println("Segundo valor");
       x = leitor.nextDouble();
       
       System.out.println("Terceiro valor");
       y = leitor.nextDouble();
       
       System.out.println("Quarto valor");
       z = leitor.nextDouble();
      
      double t= (w+x+y+z)/4;
      
      if (t>=7.0) {
    	  System.out.println("Aprovado");
    	  
    	        }
       if(t>3.5 && t<7.0) {
    	   System.out.println("Recupeção");
       }
       if(t<=3.5) {
    	   System.out.println("Reprovado");
    	   
       }
}
}