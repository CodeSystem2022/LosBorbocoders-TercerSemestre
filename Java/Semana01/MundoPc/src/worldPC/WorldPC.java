package worldPC;

import ar.com.System2023.pc.Order;
import ar.com.System2023.pc.Monitor;
import ar.com.System2023.pc.Keyboard;
import ar.com.System2023.pc.Computer;
import ar.com.System2023.pc.Mouse;

/**
 *
 * @author augusto
 */
public class WorldPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Keyboard keyboardHP = new Keyboard("Bluetooth", "HP");
        Mouse mouseHP = new Mouse("Bluetooth", "HP");
        Computer computerHP = new Computer("HP Computer", monitorHP, keyboardHP, mouseHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Keyboard keyboardGamer = new Keyboard("Bluetooth", "Gamer");
        Mouse mouseGamer = new Mouse("Bluetooth", "Gamer");
        Computer computerGamer = new Computer("Gamer Computer", monitorGamer, keyboardGamer, mouseGamer);
        
        Order order1 = new Order();
        Order order2 = new Order();
        order1.addComputer(computerHP);
        order1.addComputer(computerGamer);
        
        Computer mixedComputer = new Computer("Mixed Computer", monitorHP, keyboardGamer, mouseHP);
        order2.addComputer(mixedComputer);
        
        
        //order2.showOrder();
                
        Monitor monitorAsus = new Monitor("Asus", 42);        
        Monitor monitorSamsung = new Monitor("Samsung", 27);
        Monitor monitorGygabyte = new Monitor("Gygabyte", 21);  
        Monitor monitorDaewoo = new Monitor("Daewoo", 18);  
        Monitor monitorLenovo = new Monitor("Lenovo", 15);  
        Monitor monitorLG = new Monitor("LG", 32);  
        Monitor monitorBenq = new Monitor("Benq", 30);  
        Monitor monitorApple = new Monitor("Apple", 24);  
        
        Keyboard keyboardAsus = new Keyboard("Bluetooth", "Asus");
        Keyboard keyboardSamsung = new Keyboard("Bluetooth", "Samsung");
        Keyboard keyboardGygabyte = new Keyboard("Bluetooth", "Gygabyte");
        Keyboard keyboardDaewoo = new Keyboard("Bluetooth", "Daewoo");
        Keyboard keyboardLenovo = new Keyboard("Bluetooth", "Lenovo");
        Keyboard keyboardLG = new Keyboard("Bluetooth", "LG");
        Keyboard keyboardBenq = new Keyboard("Bluetooth", "Benq");
        Keyboard keyboardApple = new Keyboard("Bluetooth", "Apple");
        
        Mouse mouseAsus = new Mouse("Bluetooth", "Asus");
        Mouse mouseSamsung = new Mouse("Bluetooth", "Samsung");
        Mouse mouseGygabyte = new Mouse("Bluetooth", "Gygabyte");
        Mouse mouseDaewoo = new Mouse("Bluetooth", "Daewoo");
        Mouse mouseLenovo = new Mouse("Bluetooth", "Lenovo");
        Mouse mouseLG = new Mouse("Bluetooth", "LG");
        Mouse mouseBenq = new Mouse("Bluetooth", "Benq");
        Mouse mouseApple = new Mouse("Bluetooth", "Apple");
        
        Computer computerAsus = new Computer("Asus Computer", monitorAsus, keyboardAsus, mouseAsus);
        Computer computerSamsung = new Computer("Samsung Computer", monitorSamsung, keyboardSamsung, mouseSamsung);
        Computer computerGygabyte = new Computer("Gygabyte Computer", monitorGygabyte, keyboardGygabyte, mouseGygabyte);
        Computer computerDaewoo = new Computer("Daewoo Computer", monitorDaewoo, keyboardDaewoo, mouseDaewoo);
        Computer computerLenovo = new Computer("Philco Computer", monitorLenovo, keyboardLenovo, mouseLenovo);
        Computer computerLG = new Computer("LG Computer", monitorLG, keyboardLG, mouseLG);
        Computer computerBenq = new Computer("Benq Computer", monitorBenq, keyboardBenq, mouseBenq);
        Computer computerApple = new Computer("Apple Computer", monitorApple, keyboardApple, mouseApple);
        
        order1.addComputer(computerAsus);
        order1.addComputer(computerSamsung);
        order1.addComputer(computerGygabyte);
        order1.addComputer(computerDaewoo);
        order1.addComputer(computerLenovo);
        order1.addComputer(computerLG);
        order1.addComputer(computerBenq);
        order1.addComputer(computerApple);
        order1.addComputer(mixedComputer);
        
        order1.showOrder();
    }
}
