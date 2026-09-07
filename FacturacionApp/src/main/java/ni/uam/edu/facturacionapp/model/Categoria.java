package ni.uam.edu.facturacionapp.model;

import lombok.*;

public class Categoria {

    @Data
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor

    private Interger id;
    private String nombre;
    private boolean activo;

    @Override
    public String toString() {
        return nombre;
    }
}
