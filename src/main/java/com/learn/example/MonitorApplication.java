package com.learn.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author zjj
 * @date 2019/3/28 0028
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MonitorApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
      return  builder.sources(MonitorApplication.class);
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(MonitorApplication.class).web(true).run(args);
    }
}
