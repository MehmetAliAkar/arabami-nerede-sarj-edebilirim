package com.mehmetaliakar.istasyonumnerede.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SarjIstasyonlariRequest {
    private String adresMahalleCaddeSokak;
    private String hizmetSekli;
    private String sarjAgiIsletmecisiUnvan;
    private String sarjIstasyonuAdi;
    private String sarjIstasyonuMarkaTescilBelgesiMarkaAdi;
    private String sarjIstasyonuNo;
}
