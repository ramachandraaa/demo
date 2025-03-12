package game03.game02package;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mariogame Qualifier")
public class Mariogame implements gamingconsole {
    public void up()
    {
        System.out.println("Jump");
    }
    public void down()
    {
        System.out.println("Hole");
    }
    public void left()
    {
        System.out.println("back");
    }
    public void right()
    {
        System.out.println("Accelerate");
    }
}
