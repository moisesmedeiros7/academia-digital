package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data // implementa get e set
@NoArgsConstructor  // construtor vazio
@AllArgsConstructor  // construtor
@Entity  // Entidade JPA
@Table (name="tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handle"})  // ignorar exceções
public class Aluno {

  @Id // Id JPA
  @GeneratedValue( strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @Column(unique = true)
  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
  @JsonIgnore  // ignorar exceções
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
