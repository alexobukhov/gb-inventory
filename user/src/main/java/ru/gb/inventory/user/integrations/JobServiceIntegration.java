package ru.gb.inventory.user.integrations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@Component
@AllArgsConstructor

public class JobServiceIntegration {
    private final WebClient jobServiceWebClient;

//   public JobDto getCurrentJob(String username){
//        return jobServiceWebClient.get()
//                .uri("api/V1/job/0")
//                .header("username", username)
//                .retrieve()
//                .bodyToMono(JobDto.class)
//                .block();
//    }

    public void clearJob(String username) {
        jobServiceWebClient.get()
                .uri("api/V1/job/0/clear")
                .header("username", username)
                .retrieve()
                .toBodilessEntity()
                .block();
    }

}
