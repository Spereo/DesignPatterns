package org.example.labs.lab1;

import org.example.labs.lab1.Builder.BuilderService;
import org.example.labs.lab1.Singleton.SingletonService;
import org.example.labs.lab1.FactoryMethod.FactoryMethodService;
import org.example.labs.lab1.AbstractFactory.AbstractFactoryService;

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
            default:
                System.out.println("Incorrect number");
        }
    }
}