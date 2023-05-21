package ru.gb.inventory.order.configs;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import ru.gb.inventory.order.properties.UserServiceIntegrationProperties;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(
        UserServiceIntegrationProperties.class
)
public class AppConfig {

    private final UserServiceIntegrationProperties userServiceIntegrationProperties;

}
