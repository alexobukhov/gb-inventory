package ru.gb.inventory.itactive.configs;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.tcp.TcpClient;
import ru.gb.inventory.itactive.properties.UserServiceIntegrationProperties;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(
        UserServiceIntegrationProperties.class
)
public class AppConfig {

    @Bean
    public WebClient userServiceWebClient() {
        TcpClient tcpClient = TcpClient
                .create()
                .option(Chan)
    }

}
