package test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * @author XieHeng
 * @date 2018/3/23
 * @description
 */
@SpringBootApplication
public class class1  {

    @Autowired
    AsyncClass asyncClass;



    public static void main(String arg[]){
        SpringApplication.run(class1.class,arg);
    }
}
