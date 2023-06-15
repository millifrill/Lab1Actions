package com.example.Lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Lab1Application.class)
public class LiquorStoreTests {

    LiquorStore liquorStore = new LiquorStore();

    @Test
    void shouldReturnTrueIfAdult() {
        boolean result = liquorStore.isAllowedToEnterLiquorStore(30, false, false, false);

        Assertions.assertTrue(result);
    }


}
