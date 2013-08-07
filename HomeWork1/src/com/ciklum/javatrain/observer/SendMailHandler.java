package com.ciklum.javatrain.observer;

import com.sun.mail.smtp.*;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/5/13
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class SendMailHandler implements MyHandler {
    private String authname;
    private String password;

    public String getAuthname() {
        return authname;
    }

    public void setAuthname(String authname) {
        this.authname = authname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    SendMailHandler(String authname, String authpass){
        setAuthname(authname);
        setPassword(authpass);
    }

    @Override
    public Class<User> getType() {
        return User.class;
    }

    @Override
    public void handle(MyEvent event){
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(getAuthname(), getPassword());
            }
        });

        User user = (User) event.getObject();
        String username = user.getUsername();
        String useremail = user.getEmail();

        System.out.println("Sending mail...");

        try{
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(getAuthname()));
            msg.setRecipients(MimeMessage.RecipientType.TO, useremail);
            msg.setSubject("Registration");
            msg.setSentDate(new Date());

            msg.setText("Hello, " + username + "! Thank you for registration!");
            SMTPTransport.send(msg);
            System.out.println("Mail successfully sent!");
        }catch (MessagingException mex){
            System.out.println("Send failed, exception: " + mex);
        }
    }
}
