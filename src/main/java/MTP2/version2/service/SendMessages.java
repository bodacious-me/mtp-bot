package MTP2.version2.service;

import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Service
@Component
public class SendMessages {

    RestTemplate restTemplate = new RestTemplate();

    public void sendMessages(String MAIN_DOMAIN, String FAKE_DOMAIN) throws StreamReadException, DatabindException, IOException {
        System.out.println("Called the Send Message");
        
        // Read the JSON file and convert it to a List<String>
        String proxyLink = String.format(MAIN_DOMAIN);
        String CHANNEL_ID = "@MTProxyMTP";
        String BOT_TOKEN = "7592458999:AAFRC9GHHXj--x9lqc5_17AB28E-HXKbNv4";
    
        // Create a clickable link using HTML with proxyLink as the display text
        String clickableLink = String.format("<a href=\"%s\">%s</a>", proxyLink, FAKE_DOMAIN);
    
        // Print the text
        System.out.println(clickableLink);
    
        String url = String.format("https://api.telegram.org/bot%s/sendMessage", BOT_TOKEN);
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("chat_id", CHANNEL_ID);
        requestBody.put("text", clickableLink);
        requestBody.put("parse_mode", "HTML");
        String response = restTemplate.postForObject(url, requestBody, String.class);
        System.out.println(response);
    }
    
}
