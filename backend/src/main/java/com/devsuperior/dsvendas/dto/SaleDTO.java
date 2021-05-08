package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    private SellerDTO seller;

    public SaleDTO(Sale sale) {
        this.id = sale.getId();
        this.visited = sale.getVisited();
        this.amount = sale.getAmount();
        this.date = sale.getDate();
        this.deals = sale.getDeals();
        this.seller = new SellerDTO(sale.getSeller());
    }
}
