package CdiLauncherapp.launcha0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import real01.DataService;

import java.util.Arrays;

@Configuration
@Component
class BusinnessData
{
    DataServices dataService;
    @Autowired
    public void setDataService()
    {
        this.dataService=dataService;
        System.out.println("DataService has been Started");
    }
}
@Component
class DataServices
{

}
@ComponentScan
 public class CDIlauncherapp {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(CDIlauncherapp.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(ele->System.out.println(ele));

    }
}
