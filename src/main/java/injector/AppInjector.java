package injector;
import com.google.inject.AbstractModule;
import services.MessagService;
import services.EmailServices;
import services.SMSService;

public class AppInjector extends AbstractModule{

    @Override
    protected void configure() {

//        bind(MessagService.class).to(EmailServices.class);
        bind(MessagService.class).to(SMSService.class);

    }

}
