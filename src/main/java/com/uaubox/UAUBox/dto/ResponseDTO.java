package com.uaubox.UAUBox.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@ToString
public class ResponseDTO {
    private Object response;
    @Setter(AccessLevel.PRIVATE)
    @Getter(AccessLevel.PUBLIC)
    private List<String> errors;
    private String message;

    public ResponseDTO() {
        errors = new ArrayList<>();
    }
}
