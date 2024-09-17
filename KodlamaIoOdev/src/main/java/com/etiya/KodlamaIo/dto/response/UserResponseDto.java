package com.etiya.KodlamaIo.dto.response;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class UserResponseDto {
    private String id;
    private String name;
    private String surname;
    private String email;


}
