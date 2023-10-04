
/**
 * @author Lucas Monaco
 */
public class Circulo {
    private double raio;
    private String uniMed;
    
    public Circulo(String uMed){
        uniMed = uMed;
    }
    
    public void setRaio (double r){
        raio = r;
    }
    
    public String getUniMed(){
        return(uniMed);
    }
    
    public double getRaio(){
        return(raio);
    }
    
    public double calcDiametro(){
        double diametro;
        diametro = 2 * (raio);
        return (diametro);
    }
    
    public double calcArea(){
        double area;
        area = Math.PI* Math.pow(raio, 2);
        return(area);
    }
    
    public double calcPerimetro(){
        double perimetro;
        perimetro = 2 * Math.PI * raio;
        return (perimetro);
    }
}
