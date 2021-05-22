
package sis_hospital;

public class Pessoa {
        String nome;
    int idade;
    String end;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String end) {
        this.nome = nome;
        this.idade = idade;
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    
    public void validadeIdade(){
        if (getIdade() < 0) {
            
        } else {
            System.out.println("idade invalide");
        }
    }
}
