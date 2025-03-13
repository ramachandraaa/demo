package real01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class MySqlDS implements DataService{
    public int[] retrivedata()
    {
        int[]  arr=new int[]{10,20,30,40,50};
        return arr;
    }
}
