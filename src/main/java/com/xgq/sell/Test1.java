package com.xgq.sell;



import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Test1 {

    @Test
    public void test1() {
        Student s = new Student();
        s.setAge(19);
        s.setName("xiong");
        log.info("====info"+s.toString());
        log.error("====error"+s.toString());
    }
}
