package com.ecommerce.website.model.base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    @NotBlank(message = "*is required")
    private String street;

    @Column(name = "city")
    @NotBlank(message = "*is required")
    private String city;

    @Column(name = "state")
    @NotBlank(message = "*is required")
    private String state;

    @Column(name = "country")
    @NotBlank(message = "*is required")
    private String country;

    @Column(name = "zip_code")
    @NotBlank(message = "*is required")
    @Size(min = 5, max = 10, message = "Zip code must be between 5 and 10 characters")
    private String zipCode;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
}