package com.carlosfu.spring.custom.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class TestNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        System.out.println("=====================TestNamespaceHandler=======================");
        registerBeanDefinitionParser("custom", new CustomBeanDefinitionParser());
    }
}