package org.wg.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication 开启组件扫描和自动配置
ReadingListApplication 不仅是启动引导类，还是配置类
 */
@SpringBootApplication
public class ReadingListApplication {

	public static void main(String[] args) {
		// 负责启动引导应用程序
		SpringApplication.run(ReadingListApplication.class, args);
	}
}

