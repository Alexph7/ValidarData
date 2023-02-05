package DTO;

/**
 *
 * @author ph757
 */
public class ValidarData {

    /**
     * Faz Verificação de AnoDoisDigitos Bissextoe dos Meses Com 30 e 31 dias
     * @param dia
     * @param mes
     * @param anoDoisDigitos
     * @param formato 0 Para Formato Americano, 1 Para Formato Pt-Br
     *
     * @return Data Concatenada e Verificada
     */
    public String validarData(int dia, int mes, int anoDoisDigitos, int formato) {

        String dataValida = null;
        int[] limiteDiasNoMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //primeiro indice zero não tem mes, Array começa do zero.

        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException("Mês Fora do Intervalo 1-12");
        }
        if ((dia == 29 && mes == 02) && !(anoDoisDigitos % 400 == 0 || anoDoisDigitos % 4 == 0 && anoDoisDigitos % 100 != 0)) {
            throw new IllegalArgumentException("Data Inválida Para AnoDoisDigitos Não Bissexto.");
        } else if (dia <= 0 || dia > limiteDiasNoMes[mes]) {
            throw new IllegalArgumentException("Dia Inválido Para Este Mês.");
        } else if (formato == 0) {
            return dataValida = "20" + anoDoisDigitos + "-" + mes + "-" + dia; //Concatena Ano Com Dois digitos, Saida aaaa/MM/dd no formato Americano
        } else if (formato == 1) {
            return dataValida = dia + "-" + mes + "-" + "20" + anoDoisDigitos;
        } else {
            throw new IllegalArgumentException("Formato Valido 0 ou 1");
        }
    }

}
