package com.my.test.observer;

public interface DomainEventListener<T extends DomainEvent> {
	
	public void handlerEvent();

}
