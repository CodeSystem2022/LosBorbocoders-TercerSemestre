package ar.com.System2023.pc;

/**
 *
 * @author augusto
 */
public class Computer {
    private final int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computerCounter;            
    
    private Computer() {
        this.idComputer = ++ Computer.computerCounter;
    }
    
    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return this.keyboard;
    }

    public void setKeyboard(Keyboard teclado) {
        this.keyboard = teclado;
    }

    public Mouse getMouse() {
        return this.mouse;
    }
 
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    
    public int getIdComputer() {
        return this.idComputer;
    }

    @Override
    public String toString() {
        return "Computer{" + "idComputer=" + idComputer + ", name=" + name + ", monitor=" + monitor + ", keyboard=" + keyboard + ", mouse=" + mouse + '}';
    }

  
    
    
}
