package com.example.app.domain.model.DTO;

import com.example.app.domain.model.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
