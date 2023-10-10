package ex04;

import ex04.component.MyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * SptingBoot Test Integration
 *
 *
 */

@SpringBootTest
public class MyApplicationTest {
    @Autowired
    private MyComponent myComponent;

    @Test
    public void myComponentNotNull() {
        assertNotNull(myComponent);
    }
}