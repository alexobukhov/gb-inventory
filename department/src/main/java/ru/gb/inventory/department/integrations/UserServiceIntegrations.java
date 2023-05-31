package ru.gb.inventory.department.integrations;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import ru.gb.inventory.department.api.UserDto;

@Component
@RequiredArgsConstructor
public class UserServiceIntegrations {
    private final WebClient userServiceWebClient;


    public UserDto getUserById(Long Id){
        return userServiceWebClient.get()
                .uri("api/V1/user/{id}")
                .retrieve()
                .bodyToMono(UserDto.class)
                .block();
    }

    public void clear(String username) {
        userServiceWebClient.get()
                .uri("api/V1/user/0/clear")
                .header("username", username)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}
