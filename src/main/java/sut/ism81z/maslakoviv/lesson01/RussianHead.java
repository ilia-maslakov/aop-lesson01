package sut.ism81z.maslakoviv.lesson01;

import sut.ism81z.maslakoviv.lesson01.i.Head;

public class RussianHead implements Head {
    @Override
    public void think() {
        System.out.println("Думаю");
    }

    @Override
    public void watch() {
        System.out.println("Где мой трактор?");
    }
}
