package services;

import javax.inject.Singleton;

@Singleton
public class EmailServices implements MessagService {

    public boolean MessageSend(String msg , String rec) {
        //validation and sending mail
        System.out.println("Email sent to "+ rec + "saying : " + msg);
        return true;
    }

}
