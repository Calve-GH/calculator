package com.github.calvegh.to;

import lombok.Data;
import javax.validation.constraints.Pattern;
import java.util.Objects;

@Data
public class TransferObject {
    private final static String regex = "[-+]?[0-9]*";
    private final static String errMsg1 = "Invalid value of firstElement";
    private final static String errMsg2 = "Invalid value of secondElement";

    @Pattern(regexp = regex, message = errMsg1)
    private final String firstElement;

    @Pattern(regexp = regex, message = errMsg2)
    private final String secondElement;

    public TransferObject(String firstElement, String secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public long getFirst() {
        return Long.parseLong(Objects.requireNonNull(firstElement));
    }

    public long getSecond() {
        return Long.parseLong(Objects.requireNonNull(secondElement));
    }
}
