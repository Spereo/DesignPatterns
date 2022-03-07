package org.example.labs;

import org.example.labs.lab1.Builder.BuilderService;
import org.example.labs.lab1.FactoryMethod.Configuration;
import org.example.labs.lab1.Singleton.SingletonService;
import org.example.labs.lab1.FactoryMethod.FactoryMethodService;
import org.example.labs.lab1.AbstractFactory.AbstractFactoryService;
import org.example.labs.lab2.Adapter.AdapterService;
import org.example.labs.lab2.Bridge.BridgeService;
import org.example.labs.lab2.Proxy.ProxyService;
import org.example.labs.lab3.ChainOfResponsibility.ChainService;
import org.example.labs.lab3.Iterator.IteratorService;
import org.example.labs.lab3.Strategy.CommaSeparatedStrategy;
import org.example.labs.lab3.Strategy.SemicolonSeparatedStrategy;
import org.example.labs.lab3.Strategy.StrategyServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case (1):
                SingletonService singletonService = new SingletonService();
                singletonService.execute();
                break;
            case (2):
                FactoryMethodService factoryMethodService = new FactoryMethodService();
                Configuration configuration = new Configuration().initMob();
                System.out.println(factoryMethodService.execute(configuration));
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
            case (8):
                List<String> list = new ArrayList<>();
                list.add("Мама"); list.add("мыла"); list.add("раму"); list.add("рама"); list.add("мыла"); list.add("маму");

                CommaSeparatedStrategy commaSeparatedStrategy = new CommaSeparatedStrategy();
                StrategyServiceImpl strategyServiceCommaSeparatedStrategy = new StrategyServiceImpl(commaSeparatedStrategy);
                System.out.println(strategyServiceCommaSeparatedStrategy.execute(list));

                SemicolonSeparatedStrategy semicolonSeparatedStrategy = new SemicolonSeparatedStrategy();
                StrategyServiceImpl strategyServiceSemicolonSeparatedStrategy = new StrategyServiceImpl(semicolonSeparatedStrategy);
                System.out.println(strategyServiceSemicolonSeparatedStrategy.execute(list));
                break;
            case (9):
                ChainService chainService = new ChainService();
                String inputStream = "method:GET\npath:/user/info\nsession:hello-world-session";
                System.out.println(chainService.execute(inputStream));
                break;
            case (10):
                IteratorService iteratorService = new IteratorService();
                iteratorService.execute();
                break;
            default:
                System.out.println("Incorrect number");
        }
    }
}
