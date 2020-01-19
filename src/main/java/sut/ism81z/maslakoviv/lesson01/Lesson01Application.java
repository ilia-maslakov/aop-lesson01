package sut.ism81z.maslakoviv.lesson01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class Lesson01Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.properties.xml");
		//возьмем из свойств приложения описание класса
		T1000 fedor = (T1000) context.getBean("T1000");
		fedor.turnOn();

		fedor.fight();

		fedor.turnOff();
	}

}
