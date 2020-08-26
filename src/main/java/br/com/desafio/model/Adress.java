package br.com.desafio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Adress")
@Getter
@Setter
public class Adress {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Nome da Rua  não pode estar em branco")
    @Column(name = "streetName")
    private String streetName;

    @NotNull(message = "Numero  não pode estar em branco")
    @Column(name = "numberAdress")
    private Long numberAdress;

    @Column(name = "complement")
    private String complement;

    @NotBlank(message = "Bairro  não pode estar em branco")
    @Column(name = "neighbourhood")
    private String neighbourhood;

    @NotBlank(message = "Cidade  não pode estar em branco")
    @Column(name = "city")
    private String city;

    @NotBlank(message = "Estado não pode estar em branco")
    @Column(name = "state")
    private String state;

    @NotBlank(message = "País não pode estar em branco")
    @Column(name = "country")
    private String country;

    @NotBlank(message = "CEP não pode estar em branco")
    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;


    public Adress (final String streetName, final Long numberAdress,
                   final  String complement, final String neighbourhood,
                   final String city, final String state, final String country,
                   final String zipCode, final String latitude, final String longitude) {

        this.streetName = streetName;
        this.numberAdress = numberAdress;
        this.complement = complement;
        this.neighbourhood = neighbourhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Adress() {

    }

}