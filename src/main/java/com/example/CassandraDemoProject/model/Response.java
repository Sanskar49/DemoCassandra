package com.example.CassandraDemoProject.model;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Response {
    private final String status;
    private final String message;
    private final String description;

}
