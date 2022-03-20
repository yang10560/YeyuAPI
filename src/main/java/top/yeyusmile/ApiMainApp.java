package top.yeyusmile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/20 13:50
 */
@ServletComponentScan(basePackages = {"top.yeyusmile.config"})
@SpringBootApplication
//@EnableScheduling
public class ApiMainApp {

    public static void main(String[] args) {
        SpringApplication.run(ApiMainApp.class,args);
    }

}
