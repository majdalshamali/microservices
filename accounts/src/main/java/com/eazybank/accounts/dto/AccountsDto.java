package com.eazybank.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "Account number can not be Null or empty")
    @Pattern(regexp = "$|[0-9]{10}",message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of Easy bank account"
    )
    private long accountNumber;

    @NotEmpty(message = "Account type can not be Null or empty")
    @Schema(
            description = "Account Type of Easy bank account",
            example = "Saving"
    )
    private String accountType;

    @NotEmpty(message = "branch address can not be Null or empty")
    @Schema(
            description = "Branch Address of Easy bank"
    )
    private String branchAddress;
}
