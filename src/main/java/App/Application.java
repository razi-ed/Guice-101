package App;

import com.google.inject.Guice;
import com.google.inject.Injector;

import consumer.myApp;
import injector.AppInjector;

public class Application {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());

        myApp app;

        app= injector.getInstance(myApp.class);
        app.SendMessage("Hii", "xyz@abc.mn");


    }
}
