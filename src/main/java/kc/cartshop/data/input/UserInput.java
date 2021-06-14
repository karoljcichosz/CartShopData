package kc.cartshop.data.input;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInput {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Boolean enabled;
    private boolean tokenExpired;
}
