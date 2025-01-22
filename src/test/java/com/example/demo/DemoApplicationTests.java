package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.OracleContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;



@SpringBootTest
@AutoConfigureMockMvc
@Testcontainers
@ActiveProfiles("test")
class DemoApplicationTests {

	private static final Integer ORACLE_DATABASE_PORT = 1521;

	@SuppressWarnings("resource")
	@Container
	static OracleContainer ORACLE_CONTAINER =
		new OracleContainer(DockerImageName.parse("gvenzl/oracle-xe:18-slim-faststart"))
			.withExposedPorts(ORACLE_DATABASE_PORT);

	@Test
	void contextLoads() {
		// Fails with sysbox on kubernetes 1.30; works on 1.29
	}

}
