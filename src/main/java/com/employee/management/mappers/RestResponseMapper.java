package com.employee.management.mappers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class RestResponseMapper {
    public static ResponseEntity<Object> generateResponse(String statusText, HttpStatus status, Object responseObj) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", statusText);
        map.put("data", responseObj);
        return new ResponseEntity<Object>(map, status);
    }
}