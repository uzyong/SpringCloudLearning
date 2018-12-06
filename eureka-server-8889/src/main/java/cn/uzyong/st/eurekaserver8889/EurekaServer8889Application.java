package cn.uzyong.st.eurekaserver8889;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8889Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8889Application.class, args);
    }
}
