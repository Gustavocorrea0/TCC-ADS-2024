/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
