package MTP2.version2.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import MTP2.version2.service.Starter;

@Component
public class MainRunner implements CommandLineRunner {
    @Autowired
    private Starter starter;


    @Override
    public void run(String... args) throws Exception {
        starter.start();
    }

    
}