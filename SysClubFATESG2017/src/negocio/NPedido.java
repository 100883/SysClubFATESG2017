package negocio;

import entidade.EPedido;
import java.sql.SQLException;
import persistencia.PPedido;

public class NPedido {

    public void salvar(EPedido pedido) throws SQLException {

        PPedido persistencia = new PPedido();
        if (pedido.getCodigo() == 0) {
            persistencia.incluir(pedido);
        } else {
            persistencia.alterar(pedido);
        }
    }

}
