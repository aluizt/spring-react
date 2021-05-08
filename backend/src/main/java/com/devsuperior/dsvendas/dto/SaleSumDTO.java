package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sallerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        this.sallerName = seller.getName();
        this.sum = sum;
    }
}
