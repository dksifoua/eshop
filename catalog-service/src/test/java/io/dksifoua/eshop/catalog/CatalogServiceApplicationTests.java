package io.dksifoua.eshop.catalog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@ActiveProfiles(profiles = "test")
class CatalogServiceApplicationTests {

    @Test
    void contextLoads() {
        assert true;
    }

}
