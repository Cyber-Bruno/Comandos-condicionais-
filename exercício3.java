import java.util.Scanner;

public class exercício3 {
	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
       float x;
        
        
        System.out.println("Digite seu salário para verificar quanto terá de aumento e qual será seu salário novo");
        x = leitor.nextFloat();
        
        if(x >=0 && x <=1000.00) {
        	 System.out.println("Seu salário atual é = "+x+" e seu salário atualizado é = "+(x+((x*15)/100))+" Você recebeu um acrescimo de 15% de seu sálario antigo ");
        }
        if(x>=1000.01 && x <=2500.00) {
        	 System.out.println("Seu salário atual é = " +x+ " Seu novo salário é "+(x+((x*7)/100))+" Você recebeu um acrescimo de 7% de seu sálario antigo ");
        	
        }
        if(x> 2500.00) {
        	 System.out.println(" Seu salário atual é = "+x+" e você naõ teve alterações em seu salario");
        	
        }
        }
       
}