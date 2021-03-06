package cn.uzyong.st.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${foo}")
    String foo;

    @Value("${goo}")
    String goo;
    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }

    @RequestMapping(value = "/goo")
    public String getGoo() {
        return goo;
    }



}
