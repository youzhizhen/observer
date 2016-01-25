package com.my.test.observer;

public class UserLoginListener implements DomainEventListener<UserEvent>{

	private UserEvent userEvent;
	public UserLoginListener(UserEvent userEvent) {
		this.userEvent = userEvent;
	}
	@Override
	public void handlerEvent() {
		System.out.println("userLoginListener:" + userEvent.identify() + " " + userEvent.getType());
	}
}
