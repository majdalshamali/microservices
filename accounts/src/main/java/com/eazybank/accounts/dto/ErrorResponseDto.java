package com.eazybank.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(
        name = "Error response",
        description = "Schema to hold error information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by the client "
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error happened"
    )
    private HttpStatus errorCode;
    @Schema(
            description = "Error Message"
    )
    private String errorMessage;

    @Schema(
            description = "Date time of the error"
    )
    private LocalDateTime errorTime;
}
