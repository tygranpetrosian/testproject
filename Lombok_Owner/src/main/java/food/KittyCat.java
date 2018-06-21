package food;

import lombok.*;

@ToString(exclude = "caloricity")
@EqualsAndHashCode(doNotUseGetters = true)
@RequiredArgsConstructor
public class KittyCat {
    private @NonNull String name;
    private @Getter @Setter @NonNull double weight;
    private @Getter @Setter String caloricity;

}
