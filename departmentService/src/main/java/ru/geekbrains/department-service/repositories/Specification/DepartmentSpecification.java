package ru.geekbrains.department-service.repositories.Specification;

import org.springframework.data.jpa.domain.Specification;
import ru.geekbrains.D_market.core.models.Product;

public class DepartmentSpecification {

    public static Specification<Department> titleLike(String titlePart){
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("title"), String.format("%%%s%%", titlePart)));
    }
}
