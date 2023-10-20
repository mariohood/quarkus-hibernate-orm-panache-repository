package br.com.mariohood;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MovieRepository implements PanacheRepository<Movie> {

    public List<Movie> findByCountry(String country) {
        return list("SELECT m FROM Movie m WHERE m.country = ?1 ORDER BY id DESC", country);
    }
}
