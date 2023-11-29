package com.example.producer.dto;

public record UserRegisteredPayload(String fullName, String emailAddress, int confirmationCode) {
}
