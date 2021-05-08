package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    private SellerRepository repository;

    public SellerService(SellerRepository repository) {
        this.repository = repository;
    }

    public List<SellerDTO> findAll() {
        List<Seller> result = repository.findAll();
        return result.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
