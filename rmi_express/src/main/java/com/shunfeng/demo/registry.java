package com.shunfeng.demo;

import com.shunfeng.demo.service.ServerImpl;
import com.shunfeng.demo.service.ServerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class registry {
    @Autowired
    private ServerImpl serverImpl;

    @Bean
    public RmiServiceExporter rmiServiceExporter() {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceInterface(ServerInterface.class);
        exporter.setServiceName("rmiService");
        exporter.setService(serverImpl);
        exporter.setRegistryPort(5555);
        return exporter;
    }
}
