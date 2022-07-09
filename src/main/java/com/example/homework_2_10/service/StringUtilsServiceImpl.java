package com.example.homework_2_10.service;

import com.example.homework_2_10.exception.LastNameCorrectnessException;
import com.example.homework_2_10.exception.FirstNameCorrectnessException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class StringUtilsServiceImpl {

    public String examinationLastname(String lastName) {
        if (!StringUtils.isAlpha(lastName)) {
            throw new LastNameCorrectnessException();
        }
        return StringUtils.capitalize(lastName.toLowerCase());
    }

    public String examinationFirstname(String firstName) {
        if (!StringUtils.isAlpha(firstName)) {
            throw new FirstNameCorrectnessException();
        }
        return StringUtils.capitalize(firstName.toLowerCase());
    }
}
