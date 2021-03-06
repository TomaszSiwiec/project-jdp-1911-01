package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.GenericEntity;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "PRODUCT_GROUPS")
public class Group extends GenericEntity {
    @NotNull
    private String name;

    public Group(Long id, String name, List<Product> products) {
        super(id, name);
        this.products = products;
    }

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "group",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Product> products;

    public Group(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}