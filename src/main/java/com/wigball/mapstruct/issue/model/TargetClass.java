package com.wigball.mapstruct.issue.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Target class to which mapstruct should map. Enriched by lombok.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TargetClass {

    private String name;
    private Boolean oneFlag;
    private Boolean anotherFlag;

}
