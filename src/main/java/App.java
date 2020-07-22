import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanNext =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanNext.getMessage());

        Cat murka = (Cat) applicationContext.getBean(("cat"));
        System.out.println(murka.getMessage());

        Cat barsik = (Cat) applicationContext.getBean(("cat"));
        System.out.println(barsik.getMessage());

        System.out.println("(bean == beanNext) = " + (bean == beanNext));
        System.out.println("(murka == barsik) = " + (murka == barsik));
    }
}