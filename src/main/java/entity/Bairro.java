package entity;

import javax.persistence.*;

@Entity
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bairro bairro = (Bairro) o;

        return id.equals(bairro.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
