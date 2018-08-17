package com.service.csespringmvc.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-10T06:11:45.321Z")

@RestSchema(schemaId = "csespringmvc")
@RequestMapping(path = "/csespringmvc", produces = MediaType.APPLICATION_JSON)
public class CsespringmvcImpl {

    @Autowired
    private CsespringmvcDelegate userCsespringmvcDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCsespringmvcDelegate.helloworld(name);
    }

}
