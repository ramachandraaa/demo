package real01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
 class BusinessCalculation {
    private DataService dataService;
    public BusinessCalculation(DataService dataService)
    {
        this.dataService=dataService;
    }
    public int findmax()
    {
        int i = Arrays.stream(dataService.retrivedata()).max().orElse(0);
        return i;
    }
}
@Configuration
@ComponentScan
 public class launcherapp{
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(launcherapp.class);
System.out.println(        context.getBean(BusinessCalculation.class).findmax()
);
    }
}
