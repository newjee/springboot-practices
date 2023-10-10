package ex01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MyApplicationTest02 {
    @Autowired
    private MyComponent myComponent;

    @Test
    public void myComponentNotNull() {
        assertNotNull(myComponent);
    }
}