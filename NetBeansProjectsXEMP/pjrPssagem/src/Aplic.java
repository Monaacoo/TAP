import java.util.Scanner;
/**
 *
 * @author 0031432312007
 */
public class Aplic {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("Configurar passagem");
        
        System.out.println("Numero da passagem: ");
        int number = scanner.nextInt();
        Passagem objPass = new Passagem(number);
        
        System.out.println("Numero da poltrona: ");
        int poltrona = scanner.nextInt();
        objPass.setPoltrona(poltrona);
        
        System.out.println("Preço: ");
        double preco = scanner.nextInt();
        objPass.setPreco(preco);
        
        System.out.println("Tipo da passagem (comum, estudnate, idoso): ");
        String tipo = scanner.next();  
        objPass.setTipo(tipo);
        
        double desconto;
        
        if(tipo.equalsIgnoreCase("comum")){
            desconto = objPass.getPreco();
        }else if (tipo.equalsIgnoreCase("estudante")){
            desconto = objPass.getPreco() * 0.85;
        }else if (tipo.equalsIgnoreCase("idoso")){
            desconto = objPass.getPreco() * 0.75;
        }else {
            System.out.println("Tipo de passagem invalido");
            return;
        }
        System.out.println("\n Detalhes da passagem:");
        System.out.println("\n Numero da passagem: " + objPass.getNumero());
        System.out.println("\n Numero da poltrona: " + objPass.getPoltrona() );
        System.out.println("\n Tipo da passagem: " + objPass.getTipo());       
        System.out.println("\n O preco é: " + objPass.getPreco());
        System.out.println("\n O valor a pagar é: " + desconto);
    }
    
}
