/*******************************************************************************
Autor: Danrlei Almeida Araujo
Componente Curricular: Programação I
Concluido em: 23/12/2019
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum 
trecho de código de outro colega ou de outro autor, tais como provindos de livros e 
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
******************************************************************************************/

package util;

/**
 *
 * @author Danrlei Almeida Araujo
 */

public class No {
    private No pai;
    private No direita;
    private No esquerda;
    private Comparable dados;
    private int balanceamento;


    public No(Comparable dados) {
        this.dados = dados;
        this.balanceamento = 0;
    }

    public No(No pai, No esquerda, No direita, Comparable dados) {
        this.pai = pai;
        this.esquerda = esquerda;
        this.direita = direita;
        this.dados = dados;
    }

    @Override
    public String toString() {
        return dados.toString();
    }

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public Comparable getDados() {
        return dados;
    }

    public void setDados(Comparable dados) {
        this.dados = dados;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }    
}
