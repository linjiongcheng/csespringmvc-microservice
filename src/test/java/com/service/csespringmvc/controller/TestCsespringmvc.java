package com.service.csespringmvc.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsespringmvc {

        CsespringmvcDelegate csespringmvcDelegate = new CsespringmvcDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csespringmvcDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}