package cn.uzyong.st.servicefeign.controller;

import cn.uzyong.st.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    FeignService feignService;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name") String name) {
        return "FEIGN :" + feignService.home(name);
    }

}
