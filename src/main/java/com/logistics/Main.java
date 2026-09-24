package main.java.com.logistics;

import main.java.com.logistics.app.DeliveryApplication;
import main.java.com.logistics.abstractfactory.GUIFactory;
import main.java.com.logistics.abstractfactory.MacOSFactory;
import main.java.com.logistics.abstractfactory.WindowsFactory;
import main.java.com.logistics.factorymethod.Logistics;
import main.java.com.logistics.factorymethod.RoadLogistics;
import main.java.com.logistics.factorymethod.SeaLogistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String deliveryInput;
        String platformInput;

        if (args.length >= 2) {
            deliveryInput = args[0];
            platformInput = args[1];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter delivery mode (ROAD / SEA): ");
            deliveryInput = scanner.hasNextLine() ? scanner.nextLine() : "";
            System.out.print("Enter UI platform (WINDOWS / MACOS): ");
            platformInput = scanner.hasNextLine() ? scanner.nextLine() : "";
        }

        Logistics logistics = selectLogistics(deliveryInput);
        if (logistics == null) {
            System.err.println("Error: Unsupported or missing delivery mode: '" + deliveryInput + "'");
            return;
        }

        GUIFactory guiFactory = selectGUIFactory(platformInput);
        if (guiFactory == null) {
            System.err.println("Error: Unsupported or missing UI platform: '" + platformInput + "'");
            return;
        }

        System.out.println("Delivery mode: " + deliveryInput.toUpperCase().trim());
        System.out.println("UI platform: " + platformInput.toUpperCase().trim());

        DeliveryApplication app = new DeliveryApplication(guiFactory, logistics);
        app.run("laboratory equipment", "Aktau warehouse");
    }

    private static Logistics selectLogistics(String mode) {
        if (mode == null) return null;
        return switch (mode.trim().toUpperCase()) {
            case "ROAD" -> new RoadLogistics();
            case "SEA" -> new SeaLogistics();
            default -> null;
        };
    }

    private static GUIFactory selectGUIFactory(String platform) {
        if (platform == null) return null;
        return switch (platform.trim().toUpperCase()) {
            case "WINDOWS" -> new WindowsFactory();
            case "MACOS" -> new MacOSFactory();
            default -> null;
        };
    }
}
