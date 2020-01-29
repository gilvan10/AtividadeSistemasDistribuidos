package negocio;

public class RMIServer {
   
    public static void main(String args[]) {
        try{
            Calculadora calculadora = new Calculadora("primeiraCalculadoraRemota");
            
        }catch(Exception e) {
           e.printStackTrace();
        }
    }
}
