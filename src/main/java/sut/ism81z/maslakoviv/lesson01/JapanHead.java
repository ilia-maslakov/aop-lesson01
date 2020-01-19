package sut.ism81z.maslakoviv.lesson01;

import sut.ism81z.maslakoviv.lesson01.i.Head;

public class JapanHead implements Head {
    @Override
    public void think() {
        System.out.println("何も");
    }

    @Override
    public void watch() {
        System.out.println("人間を探しています...");
    }
}
