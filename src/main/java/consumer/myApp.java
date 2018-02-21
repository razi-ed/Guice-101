package consumer;

import javax.inject.Inject;

import services.MessagService;

public class myApp {

    private MessagService svc;

    @Inject
    public myApp(MessagService svc) {
        this.svc = svc;
    }

    public boolean SendMessage(String msg, String rec) {
        //logic + validation
        return svc.MessageSend(msg,rec);
    }

}
