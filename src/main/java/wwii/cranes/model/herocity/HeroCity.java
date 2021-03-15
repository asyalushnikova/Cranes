package wwii.cranes.model.herocity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HeroCity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hero_city_id;

    private String hero_city;
    private String briefing;
    private String award_dt;
    private String year_est;
    private String country;

}
