package ru.gb.inventory.department.repositories.specifications;

import org.springframework.data.jpa.domain.Specification;
import ru.gb.inventory.department.entyties.Department;

public class DepartmentSpecifications {

    public static Specification<Department> titleLike(String titlePart){
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("title"), String.format("%%%s%%", titlePart)));
    }
}
