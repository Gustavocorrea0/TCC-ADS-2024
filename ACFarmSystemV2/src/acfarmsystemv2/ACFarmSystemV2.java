package acfarmsystemv2;

import ConexaoComBanco.Conecta;
import acfarmsystemv2.telaDeInicio.CadastrarUsuarioMaster1;
import acfarmsystemv2.telaDeInicio.ControleUsuarioLogin;
import acfarmsystemv2.telaDeInicio.TelaDeLogin;

public class ACFarmSystemV2 {

    public Conecta conexaoOK;

    public static void main(String[] args) {

        if (ControleUsuarioLogin.buscarUsuario()) {
            new TelaDeLogin().setVisible(true);
        } else {
            new CadastrarUsuarioMaster1().setVisible(true);
        }

    }

}
