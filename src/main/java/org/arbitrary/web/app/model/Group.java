package org.arbitrary.web.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "description")
    private String description;

    @Column(name = "join_open_period")
    private String joinOpenPeriod;

    @Column(name = "join_open_people")
    private String joinOpenPeople;

    @Column(name = "join_open_time")
    private String joinOpenTime;

    @Column(name = "place")
    private String place;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "with_pet")
    private Boolean withPet;

    @ElementCollection
    @CollectionTable(name = "group_contact_point", joinColumns = @JoinColumn(name = "group_id"))
    @Column(name = "contact_point")
    private List<String> contactPoint;

    @Column(name = "condition")
    private String condition;

    @Column(name = "free_info")
    private String freeInfo;
}
