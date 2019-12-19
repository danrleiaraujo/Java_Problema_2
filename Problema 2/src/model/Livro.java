/** *****************************************************************************
 * Autor: Danrlei Almeida Araujo
 * Componente Curricular: Programação I
 * Concluido em: 25/11/2019
 * Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
 * trecho de código de outro colega ou de outro autor, tais como provindos de livros e
 * apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
 * de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
 * do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
 ***************************************************************************************** */
package model;

/**
 *
 * @author Danrlei Almeida Araujo
 */
public class Livro {
    private String titulo, autor, mes, link, n_Ebook, ano;

    public Livro(String n_Ebook, String titulo, String autor, String mes, String ano, String link) {
        this.n_Ebook = n_Ebook;
        this.titulo = titulo;
        this.autor = autor;
        this.mes = mes;
        this.ano = ano;
        this.link = link;
    }

    public String getN_Ebook() {
        return n_Ebook;
    }

    public String getAno() {
        return ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getMes() {
        return mes;
    }

    public String getLink() {
        return link;
    }

    public void setN_Ebook(String n_Ebook) {
        this.n_Ebook = n_Ebook;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
