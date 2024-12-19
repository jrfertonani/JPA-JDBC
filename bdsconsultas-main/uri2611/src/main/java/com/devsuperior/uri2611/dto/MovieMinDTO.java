package com.devsuperior.uri2611.dto;

import com.devsuperior.uri2611.projection.MovieMinProjection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieMinDTO {

    private Long id;
    private String name;

    public MovieMinDTO() {
    }

    public MovieMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MovieMinDTO(MovieMinProjection projection) {
        id = projection.getId();
        name = projection.getName();
    }
}
