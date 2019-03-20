package com.rmi_client.demo.action;


import com.rmi_client.demo.service.ServerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
    @Autowired
    private RmiProxyFactoryBean factoryBean;
    @ResponseBody
    @RequestMapping("/testRMI")
    public String testRMI() {
        ServerInterface rmiTestProvider = (ServerInterface) factoryBean.getObject();
        rmiTestProvider.testRMI();
        System.out.println("welcome use fuck RMI!");
        return "RMI调用成功.";
    }
}
