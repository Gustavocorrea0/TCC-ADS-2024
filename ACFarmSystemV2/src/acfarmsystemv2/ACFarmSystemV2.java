package acfarmsystemv2;

import ConexaoComBanco.Conecta;
import acfarmsystemv2.telaDeInicio.TelaDeLogin;

/**
 *
 * @author Gustavo
 */
public class ACFarmSystemV2 {

    public Conecta conexaoOK;
    public static void main(String[] args) {
        new TelaDeLogin().setVisible(true);
    }

}
