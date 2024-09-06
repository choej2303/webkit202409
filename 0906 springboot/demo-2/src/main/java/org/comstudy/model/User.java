package org.comstudy.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class User {

    private String id;
    private String name;
    private String email;

    public boolean isValid() {
        return name != null && !name.isEmpty() && email != null && !email.isEmpty();
    }
}
