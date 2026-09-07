package ni.uam.edu.facturacionapp.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Cargo {
    private Integer id;
    private String nombre;
    private String description;
}
