package com.thanaracs.listatodo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "tasks")
@Setter
@Getter
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Coluna titulo nao pode ser nula
    @Column(nullable = false)
    private String title;

    //Coluna descricao nao pode ser nula
    @Column(nullable = false)
    private String description;

    //Coluna data nao pode ser nula
    @Column(nullable = false)
    private Date deadLine;

    //Horario nao será passado por requisição, vem pelo java home ou outra configuração da maquina
    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    //quando fizer atualização registra o carimbo
    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

}
