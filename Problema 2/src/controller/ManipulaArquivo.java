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
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author Danrlei Almeida Araujo
 */
public class ManipulaArquivo {

    //importa arquivo
    public LinkedList<String[]> importa_Arquivo(String nome_Diretorio) {

        //abre um arquivo e cria um file
        File arquivoCSV = new File("C:\\Users\\danrl\\Desktop\\MI - JAVA\\PBL JAVA - PROBLEMA 2\\Arquivo.txt");

        LinkedList<String[]> linhas = new LinkedList();
        try {

            //cria um scanner para ler o arquivo
            Scanner leitor = new Scanner(arquivoCSV);

            //variavel que armazenara as linhas do arquivo
            String linha = new String();

            //ignora a primeira linha do arquivo
            leitor.nextLine();

            //percorre todo o arquivo
            while (leitor.hasNext()) {

                //recebe cada linha do arquivo
                linha = leitor.nextLine();

                //separa os campos entre as virgulas de cada linha
                String[] palavras = linha.split(";");
                linhas.add(palavras);
                
                //System.out.println(n_ebookAux);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
        return linhas;

    }

}
