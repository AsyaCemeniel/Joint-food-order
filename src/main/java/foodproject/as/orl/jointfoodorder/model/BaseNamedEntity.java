package foodproject.as.orl.jointfoodorder.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public abstract class BaseNamedEntity extends BaseEntity implements Serializable {
    protected String name;

}
