package kc.cartshop.data.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemOutput {
    private Long id;
    private String name;
    private int quantity;
    private double price;
}
