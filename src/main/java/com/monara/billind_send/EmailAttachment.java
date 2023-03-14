package com.monara.billind_send;

import jakarta.mail.MessagingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailAttachment {

    private final EmailSendService emailSendService;

    public EmailAttachment (EmailSendService emailSendService) {
        this.emailSendService = emailSendService;
    }

    public static void main(String[] args){
        SpringApplication.run(EmailAttachment.class,args);
    }

    @EventListener(ApplicationReadyEvent.class)

    public void getEmail() throws MessagingException {
        emailSendService.MonaraBillingSend("mprabhashmilindu@gmail.com","This is body","TEst","C:\\Users\\milin\\Pictures\\1221.jpg");
    }
}
