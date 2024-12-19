package com.devsuperior.uri2611.repositories;

import com.devsuperior.uri2611.entities.Movie;
import com.devsuperior.uri2611.projection.MovieMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<MovieMinProjection> search1(String genreName);
    

}
