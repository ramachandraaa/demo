package launcha0;

import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import java.util.Arrays;
@Configuration

// @ComponentScan
 public class launcherapp{
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(launcherapp.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(ele->System.out.println(ele));

    }
}
