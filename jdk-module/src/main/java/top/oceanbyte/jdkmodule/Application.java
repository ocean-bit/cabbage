package top.oceanbyte.jdkmodule;

import java.util.concurrent.CountDownLatch;
import org.springframework.boot.SpringApplication;

/**
 * Application
 *
 * @author ocean
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class);
        new CountDownLatch(1).await();
    }
}
