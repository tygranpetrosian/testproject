package animal;

import lombok.*;

@Getter
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = "weight")
public abstract class Animal {
    private String name;
    private @Setter
    int weight;

}
