
package simulacion;

public class sincronizar extends Thread{
    private int cantidad; 
    
    @Override
    public void run(){
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Hola");
            
        }
    }

   
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
