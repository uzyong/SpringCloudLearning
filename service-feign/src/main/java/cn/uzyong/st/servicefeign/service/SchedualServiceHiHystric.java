package cn.uzyong.st.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignService {
    @Override
    public String home(String name) {
        return "hi " + name + ",sorry,it's error!";
    }
}
