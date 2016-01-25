package com.haocai.application.register;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.eventbus.Subscribe;
import com.haocai.core.user.event.UserEvent;
import com.haocai.core.user.event.UserEventPublisher;
import com.haocai.core.user.event.UserEventType;
import com.haocai.infrastructure.email.EmailSender;

/**
 * Created by Michael Jiang on 16/1/12.
 */
@Service
public class UserRegisterListener {
    @Resource
    private EmailSender emailSender;

    @Autowired
    public UserRegisterListener(UserEventPublisher userEventPublisher) {
        userEventPublisher.register(this);
    }

    @Subscribe
    public void listenUserRegisterEvent(UserEvent userEvent) {
        if (userEvent.getType().equals(UserEventType.REGISTER)) {
            emailSender.send(userEvent.getName(), "welcome to join us!");
        }
    }
    
    
}
