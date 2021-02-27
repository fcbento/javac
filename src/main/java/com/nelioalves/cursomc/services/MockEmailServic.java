package com.nelioalves.cursomc.services;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.mail.SimpleMailMessage;

import javax.mail.internet.MimeMessage;


public class MockEmailServic extends AbstractEmailService{

    private static final Logger LOG = LoggerFactory.getLogger(MockEmailServic.class);

    @Override
    public void sendEmail(SimpleMailMessage msg) {
        LOG.info("Simulando envio de email");
        LOG.info(msg.toString());
        LOG.info("Email enviado");
    }

    @Override
    public void sendHtmlEmail(MimeMessage msg) {
        LOG.info("Simulando envio de email html");
        LOG.info(msg.toString());
        LOG.info("Email enviado");
    }
}
