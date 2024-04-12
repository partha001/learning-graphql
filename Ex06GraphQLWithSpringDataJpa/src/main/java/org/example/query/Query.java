package org.example.query;

import org.example.request.SampleRequest;
import org.example.response.StudentResponse;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Query {

    @Autowired
    StudentService studentService;

    @QueryMapping
    public String firstQuery() {
        return "FirstQuery";
    }

    @QueryMapping
    public String secondQuery(){
        return "SecondQuery";
    }



    @QueryMapping
    public String fullName(@Argument SampleRequest request){
        return request.getFirstname() + " " + request.getLastname();
    }

    @QueryMapping
    public StudentResponse student(@Argument int id){
        return new StudentResponse(studentService.getStudentById(id));
    }



}
