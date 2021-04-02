package com.luzsoft.clerk.data;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "packaged_items")
public class PackagedItemEntity {

    @Id
    @Builder.Default
    @Column
    private UUID id = UUID.randomUUID();

    @Column
    private String name;

    @Column
    private String code;

    @Column
    private String category;

    @Column
    private Integer units;

    @Column
    private Integer price;

}
