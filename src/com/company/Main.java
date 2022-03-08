package com.company;

import cursojava.Aluno;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //String nota1 = JOptionPane.showInputDialog("Infome uma nota do Primeiro Bimestre");
        //String nota2 = JOptionPane.showInputDialog("Infome uma nota do segundo Bimestre");
        //String nota3 = JOptionPane.showInputDialog("Infome uma nota do terceiro Bimestre");
        //String nota4 = JOptionPane.showInputDialog("Infome uma nota do quarto Bimestre");

        //aluno1.setNota1(Double.parseDouble(nota1));
        //aluno1.setNota2(Double.parseDouble(nota2));
        //aluno1.setNota3(Double.parseDouble(nota3));
        //aluno1.setNota4(Double.parseDouble(nota4));

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de Dados");
        disciplina1.setNota(90);

        aluno1.getDisciplina().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina1.setDi

         //JOptionPane.showMessageDialog (null,"Sua media final foi " + aluno1.getMediaNota());
        System.out.println(aluno1.toString());
        System.out.println(aluno1.hashCode());
    }

}


