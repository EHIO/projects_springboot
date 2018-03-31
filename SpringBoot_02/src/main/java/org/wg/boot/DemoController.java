package org.wg.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${org.wg.name}")
    private String name;

    @Autowired
    ConfigTestBean configTestBean;

    @RequestMapping("/")
    public String hello() {
        return name + "————" + configTestBean.getName();
    }
}
