package org.example.query;

import org.example.request.SampleRequest;
import org.springframework.graphql.data.method.annotation.Argument;
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

//    @QueryMapping
//    public String fullName(@Argument String firstname,@Argument String lastname){
//        return firstname + " "+ lastname;
//    }

    @QueryMapping
    public String fullName(@Argument SampleRequest request){
        return request.getFirstname() + " " + request.getLastname();
    }



}
