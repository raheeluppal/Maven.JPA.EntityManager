package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
    public class CD {
        @Id
        @GeneratedValue
        private Long id;

        private String title;
        private Integer year;
        private String artist;
        private Double price;


}