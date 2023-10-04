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
        Retangulo objRet = new Retangulo(tipoMedida);
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        objRet.setAltura(medAlt); // passagem de mensagem
        
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        objRet.setBase(medBase);//passagem de mensagem
        
        do{
            System.out.println("\n 1-Consultar area do retangulo");
            System.out.println("\n 2-Consultar perimetro do retangulo");
            System.out.println("\n 3-Sair");
            System.out.print("\n Digite uma opcao: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("Medida da area do retangulo: " + objRet.calcArea() + "" + objRet.getUniMed() + "²");
            }else {
                if (opcao == 2){
                    System.out.println("\n Medida do perimetro do  retangulo: " + objRet.calcPerimetro() + "" 
                            + objRet.getUniMed());
                }
            }
        }while(opcao < 3);
    }    
}
