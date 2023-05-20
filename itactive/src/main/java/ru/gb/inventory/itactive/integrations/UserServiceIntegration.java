package ru.gb.inventory.itactive.integrations;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class UserServiceIntegration {

    private final WebClient userServiceWebClient;


}
