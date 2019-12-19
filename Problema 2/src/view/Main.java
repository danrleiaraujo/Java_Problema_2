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
package view;

import controller.*;
import java.util.Scanner;

/**
 *
 * @author Danrlei Almeida Araujo
 */
public class Main {

    public static void main(String[] args) {
        LivroController controladorLivro = new LivroController();
        ArvoreController controladorArvore = new ArvoreController();
        ManipulaArquivo manipulacao = new ManipulaArquivo();

        Scanner teclado = new Scanner(System.in);
        int resposta, continuar = 0;
        String diretorio;

        System.out.println("Bem vindo");
        while (continuar == 0) {
            System.out.println("Digite a opção do que deseja fazer:");
            System.out.println("(1) - Cadastrar - Livro");
            System.out.println("(2) - Carregar base de dados");
            System.out.println("(3) - Gravar arquivo");
            System.out.println("(4) - Listar - autores/ quantidadades");
            System.out.println("(5) - Listar - Autor/ Livros");
            System.out.println("(6) - Listar - Livros");
            System.out.println("(7) - Buscar - Livro");
            System.out.println("(8) - Buscar - Livro / Ano");
            System.out.println("(9) - Excluir Livro");
            resposta = teclado.nextInt();

            switch (resposta) {
                case 1: // Cadastrar - Livro
                    System.out.println("CADASTRO DE LIVRO");
                    controladorLivro.criaLivro();
                    
                    
                    break;
                case 2: // Carregar base de dados
                    System.out.println("Digite a pasta que se localiza o arquivo:\n Ex.:C:\\Users\\danrl\\Desktop\\PBL JAVA - PROBLEMA 2;");
                    diretorio = teclado.next();
                    manipulacao.importa_Arquivo(diretorio);
                    break;

                case 3: // Gravar arquivo
                    break;
                case 4: // Listar - autores/ quantidadades
                    break;
                case 5: // Listar - Autor/ Livros
                    break;
                case 6: // Listar - Livros
                    break;
                case 7: // Buscar - Livro
                    break;
                case 8: // Buscar - Livro / Ano
                    break;
                case 9: // Excluir Livro
                    break;
            }
            System.out.println("Deseja voltar ao menu?\n(0) - Sim\n(1) - Não");
            continuar = teclado.nextInt();

            resposta = 0;
        }
    }

}
