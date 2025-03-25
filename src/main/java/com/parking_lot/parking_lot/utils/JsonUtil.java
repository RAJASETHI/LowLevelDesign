package com.parking_lot.parking_lot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();
    public String convertObjToJson(Object object) {
        String jsonInString = "";
        try {
            jsonInString = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("Error converting to JSON", e);
        }
        return jsonInString;
    }
}
