package services;

import javax.inject.Singleton;

@Singleton
public class SMSService implements MessagService {

    public boolean MessageSend(String msg , String rec) {
        //validation and sending mail
        System.out.println("SMS sent to "+ rec + "saying : " + msg);
        return true;
    }

}
