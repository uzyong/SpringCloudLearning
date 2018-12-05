package cn.uzyong.st.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "homeError")
    public String home(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    public String homeError(String name) {
        return "hi " + name + ",sorry,it's error！";

    }


}
