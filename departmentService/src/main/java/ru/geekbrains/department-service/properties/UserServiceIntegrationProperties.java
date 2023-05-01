package ru.geekbrains.department-service.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix="integrations.cart-service")
@Data
public class UserServiceIntegrationProperties {
    private String url;
    private Integer readTimeout;
    private Integer writeTimeout;
    private Integer connectTimeout;

}
