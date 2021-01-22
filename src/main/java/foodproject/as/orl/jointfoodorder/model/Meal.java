package foodproject.as.orl.jointfoodorder.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Meal extends BaseNamedEntity {
    private String description;
    private String size;
    private Restaurant restaurant;

}
