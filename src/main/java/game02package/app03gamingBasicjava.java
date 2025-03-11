package game02package;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("game02package")
public class app03gamingBasicjava {

    @Bean
    public GameRunner gameRunner(gamingconsole game)
    {
        var gamerunner=new GameRunner(game) ;
        return gamerunner;
    }
    public static void main(String[] args) {
    var context=    new   AnnotationConfigApplicationContext(app03gamingBasicjava.class);
    System.out.println(    context.getBean(gamingconsole.class));
        context.getBean(gamingconsole.class).down();//
        context.getBean(GameRunner.class).run();//


    }
}
