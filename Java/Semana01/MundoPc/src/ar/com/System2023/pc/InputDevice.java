
package ar.com.System2023.pc;

/**
 *
 * @author augusto
 */
public class InputDevice {
    private String inputType;
    private String brand;
    
    public InputDevice(String inputType, String brand) {
        this.inputType = inputType;
        this.brand = brand;
    }

    public String getInputType() {
        return this.inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "InputDevice{" + "inputType=" + inputType + ", brand=" + brand + '}';
    }

    
    
    
}
