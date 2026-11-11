package ro.info.uvt.tema1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.info.uvt.tema1.difexample.ClientComponent;
import ro.info.uvt.tema1.difexample.SingletonComponent;
import ro.info.uvt.tema1.difexample.TransientComponent;

@SpringBootApplication
public class Tema1Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Tema1Application.class, args);

        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();

        c = (ClientComponent) context.getBean("clientComponent");
        c.operation();
    }
}