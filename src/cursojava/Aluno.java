package cursojava;
public class Aluno {

    String nome;
    int idade;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;


    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {return nota4; }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediaNota() {

        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                '}';
    }

    //private Disciplina disciplina = new Disciplina();

    //public Disciplina getDisciplina() {
        //return disciplina;
    //}

    //public void setDisciplina(Disciplina disciplina) {
        //this.disciplina = disciplina;
    }
//}


// Esta é nossa clase/objeto que representa o Aluno
