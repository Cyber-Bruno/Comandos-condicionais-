import java.util.Scanner;

public class exerc�cio3 {
	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
       float x;
        
        
        System.out.println("Digite seu sal�rio para verificar quanto ter� de aumento e qual ser� seu sal�rio novo");
        x = leitor.nextFloat();
        
        if(x >=0 && x <=1000.00) {
        	 System.out.println("Seu sal�rio atual � = "+x+" e seu sal�rio atualizado � = "+(x+((x*15)/100))+" Voc� recebeu um acrescimo de 15% de seu s�lario antigo ");
        }
        if(x>=1000.01 && x <=2500.00) {
        	 System.out.println("Seu sal�rio atual � = " +x+ " Seu novo sal�rio � "+(x+((x*7)/100))+" Voc� recebeu um acrescimo de 7% de seu s�lario antigo ");
        	
        }
        if(x> 2500.00) {
        	 System.out.println(" Seu sal�rio atual � = "+x+" e voc� na� teve altera��es em seu salario");
        	
        }
        }
       
}