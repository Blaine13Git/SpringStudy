package com.fc.study.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResultVO {

    @JsonProperty("id")
    private Integer studentId;

    @JsonProperty("name")
    private String studentName;
}
