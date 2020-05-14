package qxdp.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class QxdpWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(QxdpWebApplication.class, args);
    }

}
