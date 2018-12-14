package com.thorough.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@EnableZuulProxy
@SpringBootApplication
@ComponentScan(basePackages = "com.thorough")
public class GatewayApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
