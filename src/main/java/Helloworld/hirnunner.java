package Helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class hirnunner {
    @Bean
    public int square()
    {
        int i = 6;
        return i*i;
    }

}
