package game02package;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class app03gamingBasicjava {
    public static void main(String[] args) {
    var context=    new   AnnotationConfigApplicationContext(gamingconfuguration.class);
    System.out.println(    context.getBean(gamingconsole.class));
        context.getBean(gamingconsole.class).down();//
        context.getBean(GameRunner.class).run();//


    }
}
