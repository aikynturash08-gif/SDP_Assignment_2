package main.java.com.logistics.app;

import main.java.com.logistics.abstractfactory.Button;
import main.java.com.logistics.abstractfactory.Checkbox;
import main.java.com.logistics.abstractfactory.GUIFactory;
import main.java.com.logistics.factorymethod.Logistics;

public class DeliveryApplication {
    private final GUIFactory guiFactory;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        this.guiFactory = guiFactory;
        this.logistics = logistics;
    }

    public void run(String cargo, String destination) {
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.paint();
        checkbox.paint();

        logistics.planDelivery(cargo, destination);
    }
}
