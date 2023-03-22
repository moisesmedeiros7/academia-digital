package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data // get e set
@NoArgsConstructor  //construtor
@AllArgsConstructor //construtor
@Entity  //anotação JPA
@Table(name="tb_avaliacoes")  //Nome da tabela no BD
public class AvaliacaoFisica {

  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne(cascade = CascadeType.ALL) //cascade: o que acontecer repercute na outra Entidade
  @JoinColumn(name = "aluno_id")  // FK com nome 'aluno_id'

  private Aluno aluno;
  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
  @Column(name = "peso_atual")
  private double peso;
  @Column(name = "altura_atual")
  private double altura;

}
