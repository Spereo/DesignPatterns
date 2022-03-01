package org.example.labs;

import org.example.labs.lab1.Builder.BuilderService;
import org.example.labs.lab1.Singleton.SingletonService;
import org.example.labs.lab1.FactoryMethod.FactoryMethodService;
import org.example.labs.lab1.AbstractFactory.AbstractFactoryService;
import org.example.labs.lab2.Adapter.AdapterService;
import org.example.labs.lab2.Bridge.BridgeService;
import org.example.labs.lab2.Proxy.ProxyService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case (1):
                SingletonService singletonService = new SingletonService();
                singletonService.execute();
            case (2):
                FactoryMethodService factoryMethodService = new FactoryMethodService();
                factoryMethodService.execute();
                break;
            case (3):
                AbstractFactoryService abstractFactoryService = new AbstractFactoryService();
                abstractFactoryService.execute();
                break;
            case (4):
                BuilderService builderService = new BuilderService();
                builderService.execute();
                break;
            case (5):
                AdapterService adapterService = new AdapterService();
                adapterService.execute();
                break;
            case (6):
                BridgeService bridgeService = new BridgeService();
                bridgeService.execute();
                break;
            case (7):
                ProxyService proxyService = new ProxyService();
                proxyService.execute();
                break;
            default:
                System.out.println("Incorrect number");
        }
    }
}
