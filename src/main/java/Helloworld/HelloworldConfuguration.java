package Helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloworldConfuguration {
    @Bean
    public String name() {

        return "Hello Ram!";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean(name = "Raju")
    @Primary
    public Pearson pearson() {
        //var pearson=new Pearson("Ravi",20);
        return new Pearson("Ramachandra", 20);
    }

    @Bean
    @Qualifier("Bypass")
    public Pearson person() {
        return new Pearson(name(), age());
    }

    @Bean
    // @Autowired
    public Pearson pearson2(@Qualifier("Bypass") Pearson pearson3) {
        return new Pearson(pearson3.name(), pearson3.age());
    }


}
