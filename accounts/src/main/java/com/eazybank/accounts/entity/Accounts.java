package com.eazybank.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts  extends BaseEntity
{
    @Column(name = "customer_id")
    public long customerId;

    @Id
    @Column(name ="account_number")
    public long accountNumber;

    private String accountType;
    private String branchAddress;

}
