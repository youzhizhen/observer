package com.my.test.observer;

public class UserRegisterListener implements DomainEventListener<UserEvent>{

	private UserEvent userEvent;
	public UserRegisterListener(UserEvent userEvent) {
		this.userEvent = userEvent;
	}
	@Override
	public void handlerEvent() {
		System.out.println("registerListener:" + userEvent.identify() + " " + userEvent.getType());
	}
}
