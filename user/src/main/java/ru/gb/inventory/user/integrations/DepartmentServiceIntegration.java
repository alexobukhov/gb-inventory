package ru.gb.inventory.user.integrations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import ru.gb.inventory.department.api.DepartmentDto;


@Component
@AllArgsConstructor
public class DepartmentServiceIntegration {
    private final WebClient departmentServiceWebClient;

    public DepartmentDto getCurrentDepartment(String username){
        return departmentServiceWebClient.get()
                .uri("api/V1/department/0")
                .header("username", username)
                .retrieve()
                .bodyToMono(DepartmentDto.class)
                .block();
    }

    public void clearDepartment(String username) {
        departmentServiceWebClient.get()
                .uri("api/V1/department/0/clear")
                .header("username", username)
                .retrieve()
                .toBodilessEntity()
                .block();
    }
}