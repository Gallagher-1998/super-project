package com.xiaoyun;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages ={"com.xiaoyun.service.impl" })
public class ProjectGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectGoodsApplication.class, args);
    }

}
