package org.example.query;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Query {

    @QueryMapping
    public String firstQuery() {
        return "FirstQuery";
    }

    @QueryMapping
    public String secondQuery(){
        return "SecondQuery";
    }
}
