package org.myapp.model;

import lombok.Data;

@Data
public class User {
    private String id;
    private AccountType type;
    private String name;
    private String status;
}
