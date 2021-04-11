 

public class Coche extends Vehiculo implements Arrancar {

    public Coche() {
        
    }
    
    private int puertas;
    private boolean aacc;
    private String tipo;
    
    public Coche (int puertas, boolean aacc, String tipo) {

        this.puertas = puertas;
        this.aacc = aacc;
        this.tipo = tipo;
    
    }
    
    public Coche(String matricula, String modelo, String marca, int kilometros, int puertas, boolean aacc, String tipo){
          
        super(matricula, modelo, marca, kilometros);
        
        this.puertas=puertas;
        this.aacc=aacc;
        this.tipo=tipo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAacc() {
        return aacc;
    }

    public void setAacc(boolean aacc) {
        this.aacc = aacc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Coche [puertas=" + puertas + ", aacc=" + aacc + ", tipo=" + tipo + "]";
    }
    
    public void arrancar(){
        System.out.println("Embragar y girar llave");
    }
    
    public void parar(){
   System.out.println("Echar freno de mano y girar llave");
}

    

}
