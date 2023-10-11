package com.utn.ParcialEmilioAmin.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Autor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Autor extends BaseEntidad{
    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Biografia", length = 1500)
    private String biografia;
}
