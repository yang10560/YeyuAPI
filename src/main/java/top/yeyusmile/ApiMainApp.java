package top.yeyusmile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 夜雨
 * @Web www.yeyusmile.top
 * @date 2022/3/20 13:50
 */
@ServletComponentScan(basePackages = {"top.yeyusmile.config","top.yeyusmile.aop"})
@SpringBootApplication
//@EnableScheduling
//@ConditionalOnClass(SpringfoxWebMvcConfiguration.class)
public class ApiMainApp/* implements WebMvcConfigurer*/ {

    public static void main(String[] args) {
        SpringApplication.run(ApiMainApp.class,args);
    }
/*

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
*/


}
