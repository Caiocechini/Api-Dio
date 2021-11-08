package dev.Caiocechini.citiesapi.states.repository;

import dev.Caiocechini.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
