package org.arbitrary.web.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupInformation {
    private String name;
    private String category;
    private String description;
    private String joinOpenPeriod;
    private String joinOpenPeople;
    private String joinOpenTime;
    private String place;
    private Integer cost;
    private Boolean withPet;
    private List<String> contactPoint;
    private String condition;
    private String freeInfo;
}
