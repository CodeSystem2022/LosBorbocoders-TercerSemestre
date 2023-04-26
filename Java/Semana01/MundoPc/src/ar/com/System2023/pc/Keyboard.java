package ar.com.System2023.pc;

/**
 *
 * @author augusto
 */
public class Keyboard extends InputDevice{
    private final int keyboardId;
    private static int keyboardCounter;
    
    public Keyboard(String inputType, String brand) {
        super(inputType, brand);
        this.keyboardId = ++Keyboard.keyboardCounter;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "idKeyboard=" + keyboardId + ", " + super.toString() + '}';
    }
       
}
