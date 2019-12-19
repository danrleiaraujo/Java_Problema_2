/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.Scanner;
import model.*;

/**
 *
 * @author Danrlei Almeida Araujo
 */
public class LivroController {
    Scanner teclado = new Scanner (System.in);
    String titulo, autor, mes, ano , link , n_Ebook;
    public Livro criaLivro() {
        
        System.out.println("Digite o nome do titulo do livro:");
        titulo = teclado.next();
        
        System.out.println("Digite o nome do autor:");
        autor = teclado.next();
        
        System.out.println("Digite o mês:");
        mes = teclado.next();
        
        System.out.println("Agora o ano:");
        ano = teclado.next();
        
        Livro livro = new Livro(n_Ebook, titulo, autor, mes, ano ,link);
        
        return livro;
    }
    
}
