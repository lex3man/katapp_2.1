import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean_hw1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean_hw1.getMessage());
        HelloWorld bean_hw2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean_hw2.getMessage());
        Cat bean_cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean_cat1.getName());
        Cat bean_cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean_cat2.getName());
    }
}