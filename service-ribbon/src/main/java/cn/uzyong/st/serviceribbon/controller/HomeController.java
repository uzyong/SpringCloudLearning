package cn.uzyong.st.serviceribbon.controller;

import cn.uzyong.st.serviceribbon.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return homeService.home(name);

    }

}
