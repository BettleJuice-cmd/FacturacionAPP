package ni.uam.edu.facturacionapp.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Empleado {

    private Integer id;
    private String nombre;
    private String apellidos;
    private Cargo cargo;
    private LocalDate fechaContratacion;
    private boolean activo;
}
