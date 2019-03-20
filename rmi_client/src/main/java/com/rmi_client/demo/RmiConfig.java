package com.rmi_client.demo;


import com.rmi_client.demo.service.ServerInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class RmiConfig {
    @Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean(){
        RmiProxyFactoryBean rmiProxyFactoryBean=new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceInterface(ServerInterface.class);
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:5555/rmiService");
        return rmiProxyFactoryBean;
    }
}
