import java.util.Scanner;
public class exerc�cio4 {
	
	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
       float x;
       float y;
       float z;
       
       System.out.println("Para verificar qual � o tipo de um triangulo, digite 3 valores, que representam os 3 lados do triangulo");
       
       
       System.out.println("Primeiro valor");
       x = leitor.nextFloat();
       
       System.out.println("Segundo valor");
       y = leitor.nextFloat();
       
       System.out.println("Terceiro valor");
      z = leitor.nextFloat();
       
       if(x==y && x==z) {
       System.out.println("Este triangulo � equil�tero");
       }
             
       
       if(x!=y && y!=z && z!=x) {
    	   System.out.println("escaleno");
       }                                         
            
    	   if( x==z && z!=y  ) {
    		   System.out.println("is�sceles");
    		   
    	   }
    	   if( x==y && y!=z  ) {
    		   System.out.println("is�sceles");
    		   
    	   }
    	   if( z==y && y!=x  ) {
    		   System.out.println("is�sceles");
    		   
    	   }
  
    	   
       }

}
