package com.parser.json;

import com.parser.json.model.OrderDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class JsonParserApplicationTests {

    @Autowired
    private ConvertJsonToObject convertJsonToObject;

    @Test
    void contextLoads() {
    }

    @Test
    void testCovertJsonToObject() throws IOException {
        String orderJson = "src/test/resources/order.json";
        OrderDetails orderDetails = convertJsonToObject.jsonToObject(orderJson);
    }
}
