package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Musician {

        @Id
        @GeneratedValue
        private Long id;



        private String first_name;
        private String last_name;
        private String instrument;


}
