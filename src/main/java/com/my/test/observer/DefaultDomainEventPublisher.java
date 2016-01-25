package com.my.test.observer;

import java.util.List;

import com.google.common.collect.Lists;

public abstract class DefaultDomainEventPublisher<T extends DomainEvent> implements DomainEventPublisher<T>{

	ThreadLocal<List<DomainEventListener<T>>> listeners = new ThreadLocal<List<DomainEventListener<T>>>() {
		@Override
		protected List<DomainEventListener<T>> initialValue() {
			return Lists.newArrayList();
		}
    };  

	@Override
	public void register(DomainEventListener<T> listener) {
		listeners.get().add(listener);
	}

	@Override
	public void unregister(DomainEventListener<T> listener) {
		listeners.get().remove(listener);
	}
	
	@Override
	public void publish(T event) {
		for(DomainEventListener<T> listener : listeners.get()) { 
			listener.handlerEvent();
		}
	}
}
