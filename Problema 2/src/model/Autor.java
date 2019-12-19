/** *****************************************************************************
 * Autor: Danrlei Almeida Araujo
 * Componente Curricular: Programação I
 * Concluido em: 23/12/2019
 * Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
 * trecho de código de outro colega ou de outro autor, tais como provindos de livros e
 * apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
 * de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
 * do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
 ***************************************************************************************** */
package model;

import java.util.LinkedList;

/**
 *
 * @author Danrlei Almeida Araujo
 */
public class Autor {

    private String nome;
    private LinkedList obras;

    public Autor(String nome, LinkedList obras) {
        this.nome = nome;
        this.obras = obras;
    }

    public String getNome() {
        return nome;
    }

    public LinkedList getObras() {
        return obras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setObras(LinkedList obras) {
        this.obras = obras;
    }

}
