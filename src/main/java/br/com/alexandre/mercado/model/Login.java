package br.com.alexandre.mercado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Usuario")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_usuario")
    private Long idusuario;

    @Column(name="e_mail")
    private String email;

    @Column(name="senha")
    private String senha;

    @Column(name="cpf")
    private String cpf;
    
}
