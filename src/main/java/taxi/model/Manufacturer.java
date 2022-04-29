package taxi.model;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Manufacturer {
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String country;
}
