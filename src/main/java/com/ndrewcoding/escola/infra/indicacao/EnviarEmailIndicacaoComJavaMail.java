package com.ndrewcoding.escola.infra.indicacao;

import com.ndrewcoding.escola.dominio.indicacao.EnviarEmailIndicacao;
import com.ndrewcoding.escola.dominio.aluno.Aluno;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "escola-mail-server");

        Session session = Session.getInstance(props, null);

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("escola@gmail.com"));
            msg.setRecipients(Message.RecipientType.TO, indicado.getEmail());
            msg.setSubject("Você foi indicado!");
            msg.setSentDate(new Date());
            msg.setText("Olá, caro aluno! Você foi indicado em nosso programa escolar.");

            Address[] addresses = {new InternetAddress("escola@gmail.com")};
            Transport.send(msg, addresses);
        } catch (MessagingException exception) {
            throw new RuntimeException("Não pôde enviar o e-mail para o aluno indicado.");
        }
    }

}
