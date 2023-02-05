package DTO;

import java.sql.Date;

/**
 * Faz Verificação de Ano Bissexto e dos Meses Com 30 e 31 dias
 *
 * Metodo Que Retorna String e Date de Sql
 * @author AlexPh7
 */
public class ValidarData {

    /**
     * Faz Verificação de Ano Bissexto e dos Meses Com 30 e 31 dias
     * @param dia
     * @param mes
     * @param anoDoisDigitosFinais
     * @param formato 0 Para Formato Americano, 1 Para Formato Pt-Br
     *
     * @return Data Concatenada e Verificada
     */
    public String validarData(String dia, String mes, String anoDoisDigitos, int formato) {
        String dataValida = null;
        int[] limiteDiasNoMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //primeiro indice zero não tem mes, Array começa do zero.

        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(anoDoisDigitos);

        if (mesInt <= 0 || mesInt > 12) {
            throw new IllegalArgumentException("Mês Fora do Intervalo 1-12");
        }
        if ((diaInt == 29 && mesInt == 02) && !(anoInt % 400 == 0 || anoInt % 4 == 0 && anoInt % 100 != 0)) {
            throw new IllegalArgumentException("Data Inválida Para AnoDoisDigitos Não Bissexto.");
        } else if (diaInt <= 0 || diaInt > limiteDiasNoMes[mesInt]) {
            throw new IllegalArgumentException("Dia Inválido Para Este Mês.");
        } else if (formato == 0) {
            return dataValida = "20" + anoInt + "-" + mesInt + "-" + diaInt; //Concatena Ano Com Dois digitos, Saida aaaa/MM/dd no formato Americano
        } else if (formato == 1) {
            return dataValida = diaInt + "-" + mesInt + "-" + "20" + anoInt;
        } else {
            throw new IllegalArgumentException("Formato Valido 0 ou 1");
        }
    }

    /**
     * Faz Verificação de AnoDoisDigitos Bissextoe dos Meses Com 30 e 31 dias
     * @param dia
     * @param mes
     * @param anoDoisDigitosFinais
     * @param formato 0 Para Formato Americano, 1 Para Formato Pt-Br
     *
     * @return Data Concatenada e Verificada
     */
    public Date validarDataSql(String dia, String mes, String anoDoisDigitos, int formato) {
        Date dataValida = null;
        int[] limiteDiasNoMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //primeiro indice zero não tem mes, Array começa do zero.

        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(anoDoisDigitos);

        if (mesInt <= 0 || mesInt > 12) {
            throw new IllegalArgumentException("Mês Fora do Intervalo 1-12");
        }
        if ((diaInt == 29 && mesInt == 02) && !(anoInt % 400 == 0 || anoInt % 4 == 0 && anoInt % 100 != 0)) {
            throw new IllegalArgumentException("Data Inválida Para AnoDoisDigitos Não Bissexto.");
        } else if (diaInt <= 0 || diaInt > limiteDiasNoMes[mesInt]) {
            throw new IllegalArgumentException("Dia Inválido Para Este Mês.");
        } else if (formato == 0) {
            return dataValida = Date.valueOf("20" + anoInt + "-" + mesInt + "-" + diaInt); //Concatena Ano Com Dois digitos, Saida aaaa/MM/dd no formato Americano

        } else if (formato == 1) {
            return dataValida = Date.valueOf(diaInt + "-" + mesInt + "-" + "20" + anoInt);
        } else {
            throw new IllegalArgumentException("Formato Valido 0 ou 1");
        }
    }

}
