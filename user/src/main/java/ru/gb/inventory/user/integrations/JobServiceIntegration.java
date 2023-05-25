package ru.gb.inventory.user.integrations;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;


@Component
@RequiredArgsConstructor
public class JobServiceIntegration {

    @Qualifier("jobServiceWebClient")
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
