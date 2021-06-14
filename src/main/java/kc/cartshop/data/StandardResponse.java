package kc.cartshop.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardResponse {
    private String code;
    private String message;
}
