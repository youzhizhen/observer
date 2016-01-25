package com.my.test.observer;

public class UserEventPublisher extends DefaultDomainEventPublisher<UserEvent> {

	@Override
	public String identify() {
		return "user_event_publisher";
	}
}
