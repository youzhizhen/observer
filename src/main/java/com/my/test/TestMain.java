package com.my.test;

public class TestMain {
	
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject("stateOne");
		Observer oberver1 = new ConcreteObserver1("observer 1", subject);
		Observer oberver2 = new ConcreteObserver1("observer 2", subject);
		Observer oberver3 = new ConcreteObserver1("observer 3", subject);
		subject.attach(oberver1);
		subject.attach(oberver2);
		subject.attach(oberver3);
		subject.notifyObserver();
	}
}
