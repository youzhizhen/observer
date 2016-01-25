package com.my.test.observer;

public class UserEvent extends DomainEvent {

	private String name;
	private UserEventType type;

	public UserEvent(String name, UserEventType type) {
		this.name = name;
		this.type = type;
	}

	@Override
	protected String identify() {
		return "user_event";
	}

	public String getName() {
		return name;
	}

	public UserEventType getType() {
		return type;
	}

}
