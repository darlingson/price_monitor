package com.darlingson.price_monitor_api.auth.models;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
}
