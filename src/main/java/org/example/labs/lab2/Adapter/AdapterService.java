package org.example.labs.lab2.Adapter;

public class AdapterService {
    public void execute() {
        RoundHole hole = new RoundHole(5);
        RoundStick roundStick = new RoundStick(5);
        System.out.println(hole.fits(roundStick));
        //Вывод: true, т.к. круглую палку можно вставить
        //в круглое отверствие такого же радиуса

        SquareStick smallSquareStick = new SquareStick(5);
        SquareStick largeSquareStick = new SquareStick(10);
        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);

        System.out.println(hole.fits(smallSquareStickAdapter));
        //Вывод: true, т.к. квадратную палку можно вставить
        //в круглое отверстие большего радиуса

        System.out.println(hole.fits(largeSquareStickAdapter));
        //Вывод: false, т.к. квадратную палку нельзя вставить
        //в круглое отверстие меньшего радиуса
    }
}
