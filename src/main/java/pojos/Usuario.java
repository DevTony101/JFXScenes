package pojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public final class Usuario {
    private String nombre;
    private String apellido;
    private String ciudad;
}
