package com.example.demo.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class studentDTO {
    
    @NotBlank(message="Name cannot be empty")
    private String name;

    @Email(message="valid email enter")
    private String email;

}
