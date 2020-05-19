import java.util.Scanner;
public class exercício4 {
	
	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
       float x;
       float y;
       float z;
       
       System.out.println("Para verificar qual é o tipo de um triangulo, digite 3 valores, que representam os 3 lados do triangulo");
       
       
       System.out.println("Primeiro valor");
       x = leitor.nextFloat();
       
       System.out.println("Segundo valor");
       y = leitor.nextFloat();
       
       System.out.println("Terceiro valor");
      z = leitor.nextFloat();
       
       if(x==y && x==z) {
       System.out.println("Este triangulo é equilátero");
       }
             
       
       if(x!=y && y!=z && z!=x) {
    	   System.out.println("escaleno");
       }                                         
            
    	   if( x==z && z!=y  ) {
    		   System.out.println("isósceles");
    		   
    	   }
    	   if( x==y && y!=z  ) {
    		   System.out.println("isósceles");
    		   
    	   }
    	   if( z==y && y!=x  ) {
    		   System.out.println("isósceles");
    		   
    	   }
  
    	   
       }

}
