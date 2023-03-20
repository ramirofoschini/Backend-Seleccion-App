package com.itr;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration

@OpenAPIDefinition(
        info = @Info(
                title = "Api Seleccion",
                version = "1.1",
                description = "Api con arquitectura RestFull desarrollada con Springboot",
                license = @License(name = "Apache 2.0", url = "http://foo.bar"),
                contact = @Contact(url = "https://www.linkedin.com/in/ramirofoschini", name = "Ramiro Foschini", email = "foschiniramiro@gmail.com")
        )
)
public class SwaggerConfig {

}

