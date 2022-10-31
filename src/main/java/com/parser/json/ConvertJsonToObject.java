package com.parser.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.parser.json.model.OrderDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
@Slf4j
public class ConvertJsonToObject {

    public OrderDetails jsonToObject(String rawJson) throws IOException {
        log.debug("parsing started");
        ObjectMapper objectMapper = new ObjectMapper();
        OrderDetails orderDetails = objectMapper.readValue(new File(rawJson), OrderDetails.class);
        log.info("final parse object:: " + orderDetails);
        return orderDetails;
    }
}
