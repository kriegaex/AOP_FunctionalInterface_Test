package test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author XieHeng
 * @date 2018/4/19
 * @description
 */
@EnableScheduling
@Component
public class AsyncClass {
    @Autowired
    Class2 class2;


    @Scheduled(fixedRate = 1000)
    public void print(){
        System.out.println("Scheduled"+this);
        class2.print();
    }
}
