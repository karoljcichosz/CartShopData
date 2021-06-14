package kc.cartshop.data.output;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserOutput {
    private String firstName;
    private String lastName;
    private String email;
    private Boolean enabled;
    private boolean tokenExpired;
}
