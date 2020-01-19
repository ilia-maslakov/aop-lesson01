package sut.ism81z.maslakoviv.lesson01;

import sut.ism81z.maslakoviv.lesson01.i.Head;
import sut.ism81z.maslakoviv.lesson01.i.Robot;

public class T1000 implements Robot {

    Head head;
    public T1000() {
    }


    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public T1000(Head head) {
        super(); //вызов конструктора суперкласса
        this.head = head;
    }

    @Override
    public void turnOn() {
        System.out.println("I was born.. phhh...");
    }

    @Override
    public void turnOff() {
        System.out.println("I'll be ba...");
    }

    @Override
    public void fight() {
        head.watch();
        head.think();
        System.out.println("Kill all humans... kill all humans... must kill all humans..");
    }
}
