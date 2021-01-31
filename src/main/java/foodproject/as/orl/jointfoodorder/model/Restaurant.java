package foodproject.as.orl.jointfoodorder.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "restaurants")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Restaurant extends BaseNamedEntity implements Serializable {

    @Column(name = "address", nullable = false)
    @NotBlank
    @Size(min = 2, max = 200)
    private String address;

    @Column(name = "description", nullable = false)
    @NotBlank
    @Size(min = 2, max = 400)
    private String description;

    @Column(name = "kosher", nullable = false, columnDefinition = "bool default true")
    private boolean kosher;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")//, cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonManagedReference
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Meal> menu;

    public Restaurant(Integer id, String name, String address, String description, boolean kosher, List<Meal> menu) {
        super(id,name);
        this.address = address;
        this.description = description;
        this.kosher = kosher;
        this.menu = menu;
    }


}
