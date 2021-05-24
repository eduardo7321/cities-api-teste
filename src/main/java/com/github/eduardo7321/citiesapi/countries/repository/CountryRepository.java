package com.github.eduardo7321.citiesapi.countries.repository;

import com.github.eduardo7321.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
