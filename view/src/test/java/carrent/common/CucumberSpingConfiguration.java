package carrent.common;

import carrent.ViewApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ViewApplication.class })
public class CucumberSpingConfiguration {}
