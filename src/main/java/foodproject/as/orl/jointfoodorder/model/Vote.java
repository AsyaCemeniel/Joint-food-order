package foodproject.as.orl.jointfoodorder.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Vote extends BaseEntity {
    private LocalDate date;
    private User user;
    private Restaurant restaurant;
}
