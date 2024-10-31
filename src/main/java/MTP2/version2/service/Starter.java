package MTP2.version2.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class Starter {
    @Autowired
    NameGenerator nameGenerator;

    @Autowired
    SendMessages sendMessages;

    @Scheduled(fixedRate = 3600000, initialDelay = 0)
    public void start() throws IOException {
        System.out.println("started the start method");
        System.out.println(nameGenerator.nameGeneratorMethod());
        // String FAKE_DOMAIN = "♾♾♾♾♾♾♾♾♾\n" +
        // nameGenerator.nameGeneratorMethod()
        // + "\n" +
        // "Port " + "443" + "\n" +
        // "Secret " + "iaudzvcbao'widegfufbbawesdiubuajbduoefbwaesrdgsfrsesfdaeds" +
        // "</a>\n" +
        // "♾♾♾♾♾♾♾♾♾\n" +
        // "Location "+"🇬🇧"+"\n" +
        // "♾♾♾♾♾♾♾♾♾\n" +
        // "Sponsor @MTProxyMTP\n" +
        // "♾♾♾♾♾♾♾♾♾";
        // String FAKE_DOMAIN = "ssssssssss";

        String FAKE_DOMAIN = String.format("♾♾♾♾♾♾♾♾♾\n" +
                "Server "
                + "\n"
                + nameGenerator.nameGeneratorMethod()
                + "\n" +
                "Port     " + "443" + "\n" +
                "Secret   " + "0954a8517132e5b213c254bbesfr3342ersdcdfsertehtdgfdsx2b563dd2" + "\n" +
                "♾♾♾♾♾♾♾♾♾\n" +
                "Location " + "🇬🇧" + "\n" +
                "♾♾♾♾♾♾♾♾♾\n" +
                "Sponsor @MTProxyMTP\n" +
                "♾♾♾♾♾♾♾♾♾");

        sendMessages.sendMessages(
                "https://t.me/proxy?server=162.55.41.158&port=6060&secret=ee8382059903823a387ca0c8f881e45672676f6f676c652e636f6d",
                FAKE_DOMAIN);
    }
}
