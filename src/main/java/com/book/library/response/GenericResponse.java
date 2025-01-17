package com.book.library.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
public class GenericResponse {
    private HttpStatus statusCode;

    private String msg;

    private Object body;
}
