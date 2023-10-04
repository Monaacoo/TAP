import java.util.Scanner;

/**
 * @author Lucas Monaco
 */
public class Aplic {

    public static void main(String[] args) {
         int opcao;
        double medAlt, medBase;
        String tipoMedida;
        
        //Instanciar um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a unidade de medida: ");
        tipoMedida = entrada.next();
        
        //Instanciar um objeto da classe Retangulo
        Circulo objCirc = new Circulo(tipoMedida);
        
        System.out.println("Digite a medida do raio: ");
        medAlt = entrada.nextDouble();
        objCirc.setRaio(medAlt); // passagem de mensagem
       
        
        do{
            System.out.println("\n 1-Consultar area do circulo");
            System.out.println("\n 2-Consultar perimetro do circulo");
            System.out.println("\n 3-Consultar diametro do circulo");
            System.out.println("\n 4-Sair");
            System.out.print("\n Digite uma opcao: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("Medida da area do circulo: " + objCirc.calcArea() + "" + objCirc.getUniMed() + "²");
            }else{
                if ( opcao == 2){
                    System.out.println("Medida da perimetro do circulo: " + objCirc.calcPerimetro() + "" + objCirc.getUniMed() + "²");
                }if ( opcao == 3){
                    System.out.println("Medida da diametro do circulo: " + objCirc.calcDiametro() + "" + objCirc.getUniMed() + "²");
                }if ( opcao == 4){
                    opcao = 4;
                }
            }
        }while(opcao < 4);
    }    
}
