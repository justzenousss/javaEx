package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class FormDangKyApplication {

    @Value("${server.port:default}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(FormDangKyApplication.class, args);
    }

    @PostConstruct
    public void checkPort() {
        System.out.println("✅ Đang chạy với PORT: " + port);
    }
}
