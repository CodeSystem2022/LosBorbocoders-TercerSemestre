package ar.com.System2023.pc;

/**
 *
 * @author augusto
 */
public class Mouse extends InputDevice{
    private final int idMouse;
    private static int mouseCounter;
        
    public Mouse(String inputType, String brand) {
        super(inputType, brand);
        this.idMouse = ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        return "Mouse{" + "idMouse=" + idMouse + ", " + super.toString() +'}';
    }
   
}
