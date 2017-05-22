package negocio;

import entidade.EProduto;
import java.sql.SQLException;
import java.util.List;

public class NProduto {

    public EProduto consultar(int parametro) throws SQLException {
        return new persistencia.PProduto().consultar(parametro);
    }

    public List<EProduto> listar(EProduto parametro) throws Exception {
        return new persistencia.PProduto().listar(parametro);
    }

}
