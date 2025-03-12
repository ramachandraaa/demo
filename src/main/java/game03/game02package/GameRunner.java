package game03.game02package;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    gamingconsole game;
    public GameRunner( @Qualifier("Mariogame Qualifier") gamingconsole game) {
        this.game=game;
    }

    public void run() {
        System.out.println("Game running "+game);
        game.down();
        game.left();
        game.up();
        game.right();
    }
}
