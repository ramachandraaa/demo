package Helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02Helloworldspring {
    public static void main(String[] args) {
        //Launch Spring context-
        //confugure the things we want the spring to manage-@confuguration
        var context=new AnnotationConfigApplicationContext(HelloworldConfuguration.class);
System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        //System.out.println(context.getBean("pearson"));
        System.out.println(context.getBean("person"));
        System.out.println(Pearson.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(ELE->System.out.println(ELE));
        System.out.println(context.getBean(Pearson.class));
        System.out.println(context.getBean(Pearson.class));
        System.out.println(context.getBean("pearson2"));







    }
}
