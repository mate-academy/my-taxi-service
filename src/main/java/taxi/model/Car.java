package taxi.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Car {
    private Long id;
    @NonNull
    private String model;
    @NonNull
    private Manufacturer manufacturer;
    private List<Driver> drivers = new ArrayList<>();
}
