package extra;

import java.util.*;   

public class Numeros{   
  public static void main(String args[]){   
         
      Scanner leitura = new Scanner(System.in);   
      double numero=0;
      double total=0;
      
      System.out.println("Pressione ctrl z + enter para determinar q não serão inseridos mais números");
      
      while (leitura.hasNext()){
    	  numero = leitura.nextDouble();
    	  total = numero + total;
      }
      System.out.println("Resultado: " + total);
  }
} 

