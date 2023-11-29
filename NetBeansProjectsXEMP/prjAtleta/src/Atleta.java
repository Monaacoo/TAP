/**
 *
 * @author Dimas
 */
public class Atleta {    
    private String cpf;
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    public Atleta (String c, String n){
        cpf = c;
        nome = n;
    }
    public void setIdade (int i){
        idade = i;
    }
    public void setAltura (double a){
        altura = a;
    }
    public void setPeso (double p){
        peso = p;
    }
    public String getCpf (){
        return cpf;
    }
    public String getNome (){
        return nome;
    }
    public int getIdade (){
        return idade;
    }
    public double getAltura (){
        return altura;
    }
    public double getPeso (){
        return peso;
    }
    public double calcIMC (){
        return peso/(altura * altura);
    }    
}
