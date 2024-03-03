package com.mehmetaliakar.istasyonumnerede.core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Sarj-Istasyonlari")
@Getter
@Setter
public class SarjIstasyonlari {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adresMahalleCaddeSokak;
    private String hizmetSekli;
    private String sarjAgiIsletmecisiUnvan;
    private String sarjIstasyonuAdi;
    private String sarjIstasyonuMarkaTescilBelgesiMarkaAdi;
    private String sarjIstasyonuNo;

}
