package org.example.labs.lab3.Strategy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStrategy {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("Мама"); list.add("мыла"); list.add("раму"); list.add("рама"); list.add("мыла"); list.add("маму");

        Strategy strategy = new CommaSeparatedStrategy();
        StrategyServiceImpl strategyService = new StrategyServiceImpl(strategy);
        strategyService.execute(list);
        assertEquals("Мама,мыла,раму,рама,мыла,маму", strategyService.execute(list));

        strategy = new SemicolonSeparatedStrategy();
        strategyService.setStrategy(strategy);
        strategyService.execute(list);
        assertEquals("Мама;мыла;раму;рама;мыла;маму", strategyService.execute(list));
    }
}
