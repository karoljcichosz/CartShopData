package kc.cartshop.data.output;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartOutput {

    private String customerId;
    private List<CartItemOutput> items;
    private double price;
    private ZonedDateTime lastModifiedTime;
}
