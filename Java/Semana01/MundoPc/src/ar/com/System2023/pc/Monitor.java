
package ar.com.System2023.pc;

/**
 *
 * @author augusto
 */
public class Monitor { 
    private final int idMonitor;
    private String brand;
    private double size;
    private static int monitorCounter;
    
    private Monitor() {       
        this.idMonitor = ++Monitor.monitorCounter;
        
    }
    
    public Monitor(String brand, double size) {
        this(); // constructor vacio
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    public int getIdMonitor() {
        return this.idMonitor;
    }    

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", brand=" + brand + ", size=" + size + '}';
    }

    
    
    
}
