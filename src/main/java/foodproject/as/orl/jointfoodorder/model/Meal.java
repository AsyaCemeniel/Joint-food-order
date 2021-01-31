package foodproject.as.orl.jointfoodorder.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "meals")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Meal extends BaseNamedEntity {

    @Column(name = "description", nullable = false)
    @NotBlank
    @Size(min = 2, max = 400)
    private String description;

    @Column(name = "size")
    @Size(max = 20)
    private String size;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @JsonBackReference
    private Restaurant restaurant;

    public Meal(Integer id, String name, String description, String size, Restaurant restaurant) {
        super(id,name);
        this.description = description;
        this.size = size;
        this.restaurant = restaurant;
    }

}
