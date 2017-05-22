package negocio;

import java.sql.SQLException;
import persistencia.PMensalidade;

public class NMensalidade {

    public boolean existeMensalidadeEmAberto(int codigo_associado) throws SQLException {

        return new PMensalidade().existeMensalidadeAberto(codigo_associado);
    }

}
