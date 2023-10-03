/** 
 * @author Lucas Monaco
 */
public class Buzina {
   private boolean estado;
   
   //metodo contrutor
   //tem o mesmo nome da classe
   //fornece um estado inicial
   //para o objeto
   public Buzina(){
       estado = false;
   }
   public void ligar(){
       estado = true;
   }
   public void desligar(){
       estado = false;
   }
   public void acionar(){
        if(estado == true){
            System.out.println("FonFon");
       }
   }
   public boolean obterEstado(){
       return(estado);
   }
}
