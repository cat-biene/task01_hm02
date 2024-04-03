package de.ait.model;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class User {
    private Long id;
    private String name;
    private String email;
}
