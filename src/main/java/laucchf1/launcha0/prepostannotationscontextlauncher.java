package laucchf1.launcha0;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class someclass
{
private somedependency somedep;
public someclass(somedependency somedep) {
    super();
    this.somedep = somedep;
    System.out.println("All the dependencoies are redy");
}
    @PostConstruct
   public void initilise()
    {
        somedep.getredy();

    }
    @PreDestroy
    public void cleanup()
    {
        System.out.println("Cleaned");
    }

}
@Component

class somedependency{

    public void getredy() {
        System.out.println("Hey I am avaliable to perform the operations");
    }
}
@Configuration
@ComponentScan
 public class prepostannotationscontextlauncher {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(prepostannotationscontextlauncher.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(ele->System.out.println(ele));

    }
}
