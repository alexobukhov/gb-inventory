package ru.geekbrains.D_market.core.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ru.geekbrains.D_market.core.models.Product;
import ru.geekbrains.D_market.core.repositories.ProductRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;    // Для эмуляции backend a

    @MockBean
    private ProductRepository productRepository;

    @Test
    public void getAllProductsTest() throws Exception{
        Product product = new Product();
        product.setId(1L);
        product.setTitle("Beer");
        product.setPrice(BigDecimal.valueOf(333));

        List<Product> productList = new ArrayList<>(Arrays.asList(product));

//        List<Product> productList = productRepository.findAll();
        given(productRepository.findAll()).willReturn((List<Product>) productList);

        mockMvc.perform(get("/api/V1/products").contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].title", is(productList.get(0).getTitle())));
    }
}
