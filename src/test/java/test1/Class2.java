package test1;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author XieHeng
 * @date 2018/4/19
 * @description
 */
@EnableAsync
@Component
public class Class2 {

    private int aaa;
    @Async
    public void print(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aaa++;
        System.out.println(this+"  aaa="+aaa);
    }

    @PostConstruct
    public void setAAA(){
        aaa=0;
    }
}
