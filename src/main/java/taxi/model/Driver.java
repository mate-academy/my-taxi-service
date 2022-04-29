package taxi.model;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Driver {
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String licenseNumber;
    @NonNull
    private String login;
    @NonNull
    private String password;
}
