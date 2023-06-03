package ru.gb.inventory.department.integrations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@AllArgsConstructor
public class UserServiceIntegrations {
    private final WebClient userServiceWebClient;


}
