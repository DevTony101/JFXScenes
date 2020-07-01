package utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pojos.Usuario;

@NoArgsConstructor
public final class UsuarioHolder {

    @Setter
    @Getter
    private Usuario usuario;

    private static final UsuarioHolder INSTANCE = new UsuarioHolder();

    public static UsuarioHolder getInstance() {
        return INSTANCE;
    }
}
