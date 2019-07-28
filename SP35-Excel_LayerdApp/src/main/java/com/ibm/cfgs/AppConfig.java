package com.ibm.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages= {"com.ibm.dao","com.ibm.service"})
@ComponentScan(basePackages= {"com.ibm"})
public class AppConfig {

}
