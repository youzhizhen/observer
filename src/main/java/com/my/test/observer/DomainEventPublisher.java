package com.my.test.observer;

/**
 * 领域事件发射器
 * Created by Michael Jiang on 16/1/12.
 */
public interface DomainEventPublisher<T extends DomainEvent> {
    String identify();

    void register(DomainEventListener<T> listener);
    
    void unregister(DomainEventListener<T> listener);

    void publish(T event);
}
