package real01;

import org.springframework.stereotype.Component;

@Component
public class MongoDBDS implements DataService{
   public int[] retrivedata()
    {
        int[]  arr=new int[]{1,2,3,4,5};
        return arr;
    }

}
