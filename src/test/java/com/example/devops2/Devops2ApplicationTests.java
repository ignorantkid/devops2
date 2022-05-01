package com.example.devops2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Devops2ApplicationTests {

    @Autowired
    private MyService myService;

    @Test
    public void addTest() {
        int res = myService.add(1, 2);
        assert res == 3;
    }

    @Test
    public void addTest2() {
        int res = myService.add(333, 22);
        assert res == 355;
    }

}
