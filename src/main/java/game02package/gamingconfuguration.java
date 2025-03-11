package game02package;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class gamingconfuguration {
    @Bean
    public gamingconsole game()
    {
        var game=new Mariogame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(gamingconsole game)
    {
       var gamerunner=new GameRunner(game) ;
       return gamerunner;
    }

}
