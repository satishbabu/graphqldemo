package com.apnatriangle.graphqldemo;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    public String firstQuery() {
        return "First Query";
    }

    public String fullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }
}
