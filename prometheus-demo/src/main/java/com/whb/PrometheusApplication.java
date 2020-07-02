package com.whb;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableScheduling
public class PrometheusApplication {
    public static void main(String[] args) {
        SpringApplication.run(PrometheusApplication.class, args);
    }

    @RequestMapping(value = "/hello")
    public String sayHello() {
        for (int i = 1; i <= 100000000; i++) {
            System.out.println("32212");
        }
        return "ok";
    }


    @Bean
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> registry.config().commonTags("application", "Prometheus-demo");
    }
}
