package com.eazybank.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold successfully response information"
)
public class ResponseDto {

    @Schema(
            name = "Status code in the response"
    )
    private String statusCode;

    @Schema(
            name = "status message of the response"
    )
    private String statusMsg;
}
