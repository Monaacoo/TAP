/**
 * @author Lucas Monaco
 */
public class Circulo {
    private double raio;
    private String uniMed;
    
    public Circulo(String uMed){
        uniMed = uMed;
    }
    
    public void setRaio(double r){
        raio = r;
    }   
    
    public double getRaio(){
        return(raio);
    }  
    
    public String getUnimed(){
        return(uniMed);
    }
    
    public double calcArea(){
        return (3.1416 * raio * raio);
        //return (Math.PI * Math.pow(raio, 2)); Utilizando Math
    }    
    
    public double calcPerimetro(){
        return (2 * 3.1416 * raio);
        //return (2 * Math.PI * raio); Utilizando Math
    }
    
    public double calcDiametro(){
        return(2 * raio);
    }
}  
