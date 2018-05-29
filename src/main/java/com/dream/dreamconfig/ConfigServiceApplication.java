package com.dream.dreamconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author huxingnan
 * @date 2018/5/28 16:59
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {
    public static void main(String...args){
        SpringApplication.run(ConfigServiceApplication.class,args);
    }

}
