package foodproject.as.orl.jointfoodorder.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Restaurant extends BaseNamedEntity implements Serializable {
    private String address;
    private String description;
    private boolean kosher;
    private List<Meal> menu;


}
