import java.util.Scanner;
/**
 * @author Lucas Monaco
 */
public class Aplic {

    public static void main(String[] args) {
       int opcao;
       
       //instanciação de um objeto da classe Scanner
       Scanner entrada = new Scanner(System.in);
       
       //instanciação de um objeto da classe buzina
       Buzina objBuzina = new Buzina();
       
       do{
           System.out.println("\n1 - Ligar a Buzina");  
           System.out.println("2 - Desligar a Buzina");  
           System.out.println("3 - Acionar a Buzina");  
           System.out.println("4 - Sair");  
           System.out.print("Digite a opcao");  
           
           opcao = entrada.nextInt();
               
          if (opcao == 1){
              if(objBuzina.obterEstado() == false){
                  objBuzina.ligar();
                  System.out.println("A buzina foi ligada");
              }else{
                  System.out.println("A buzina ja esta ligada");
              }
          }
       }while(opcao < 4);
       
       
    }
    
}
