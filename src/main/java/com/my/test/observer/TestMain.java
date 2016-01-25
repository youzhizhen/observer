package com.my.test.observer;

public class TestMain {
	public static void main(String[] args) {
		
		UserEventPublisher userEventPublisher = new UserEventPublisher();
		
		UserEvent loginEvent = new UserEvent("login", UserEventType.LOGION);
		DomainEventListener<UserEvent> listener1 = new UserLoginListener(loginEvent);
		DomainEventListener<UserEvent> listener2 = new UserRegisterListener(loginEvent);
		
		userEventPublisher.register(listener1);
		userEventPublisher.register(listener2);
		userEventPublisher.publish(loginEvent);
	}
}
