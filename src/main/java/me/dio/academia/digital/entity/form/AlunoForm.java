package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank (message = "Preencha o campo corretamente.") //Anotação somente para String
  @Size (min=3, max=50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotBlank (message = "Preencha o campo corretamente.")
  @CPF (message = "'${validatedValue}' é inválido!")  //validação de CPF
  private String cpf;

  @NotBlank (message = "Preencha o campo corretamente.")
  @Size (min=3, max=50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull(message = "Preencha o campo corretamente.")
  @Past (message = "Data '${validatedValue}' é inválida.") //Data tem que ser PASSADO
  private LocalDate dataDeNascimento;
}
