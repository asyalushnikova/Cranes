package wwii.cranes.model.memorial;

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
public class Memorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memorial_id;

    private String memorial;
    private String location;
    private String description;
    private String year_op;
    private String architect;
    private String sculptor;

}
