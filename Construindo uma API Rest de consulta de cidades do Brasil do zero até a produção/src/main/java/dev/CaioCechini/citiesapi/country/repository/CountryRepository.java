package dev.Caiocechini.citiesapi.country.repository;

import dev.Caiocechini.citiesapi.country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
