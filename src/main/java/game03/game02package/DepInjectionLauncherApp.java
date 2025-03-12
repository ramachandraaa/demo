package game03.game02package;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class yourbusinessclass{
    dependency dep;
    dependency01 depo1;
    public String toString()
    {
        return "Using: " + depo1+" using: "+dep;
    }

    public yourbusinessclass(dependency dep, dependency01 depo1) {
        super();
        System.out.println("Constructor class injected!!");
        this.dep = dep;
        this.depo1=depo1;
    }
    /*@Autowired
    public void setDep(dependency dep) {
        this.dep = dep;
    }
@Autowired
    public void setDepo1(dependency01 depo1) {
        this.depo1 = depo1;
    }*/

}
@Component
class dependency01{

}
@Component
class dependency{

}


@Configuration
@ComponentScan
public class DepInjectionLauncherApp {

    public static void main(String[] args) {
    var context=    new   AnnotationConfigApplicationContext(DepInjectionLauncherApp.class);
    System.out.println(    context.getBean(gamingconsole.class));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(ele->System.out.println(ele));
System.out.println(context.getBean(yourbusinessclass.class));


    }
}
