package com.github.calvegh.to;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class Result {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Long result;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String error;

    public Result(long result) {
        this.result = result;
        this.error = null;
    }

    public Result(String error) {
        this.result = null;
        this.error = error;
    }
}
