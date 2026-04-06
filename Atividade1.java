/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;

/**
 *
 * Projeto: Sistema de Notas
 * Programação Orientada a Objetos
 */

import java.util.Scanner;

public class Atividade1 {
    
    static class Aluno {
        double nota1, nota2, nota3, nota4;
        
    public Aluno (double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    
    public void calcularNota() {
        double menor = nota1;
        
        if (nota2 < menor) menor = nota2;
        if (nota3 < menor) menor = nota3;
        if (nota4 < menor) menor = nota4;
        
        double soma = nota1 + nota2 + nota3 + nota4;
        
        double somaFinal = soma - menor;
        
        double media = somaFinal / 3;
        
        System.out.println("\nNota descartada: " + menor);
        System.out.println("\nNotas consideradas:");
        
        if (nota1 != menor) System.out.println("Nota1: " + nota1);
        if (nota2 != menor) System.out.println("Nota2: " + nota2);
        if (nota3 != menor) System.out.println("Nota3: " + nota3);
        if (nota4 != menor) System.out.println("Nota4: " + nota4);
        
        System.out.println("\nMedia: " + media);
        
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }       
}
    
    public static void main(String[] args)
    {
        System.setProperty("file.encoding", "UTF-8");
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("\n=== BOLETIM DO ALUNO ===");
        System.out.print("\nDigite a nota 1: ");
        double nota1 = leitor.nextDouble();
        
        System.out.print("\nDigite a nota 2: ");
        double nota2 = leitor.nextDouble();
        
        System.out.print("\nDigite a nota 3: ");
        double nota3 = leitor.nextDouble();
        
        System.out.print("\nDigite a nota 4: ");
        double nota4 = leitor.nextDouble();
        
        Aluno aluno = new Aluno(nota1, nota2, nota3, nota4);
        
        aluno.calcularNota();
        
        leitor.close();
    }
}
