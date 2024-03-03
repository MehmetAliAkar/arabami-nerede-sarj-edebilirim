package com.mehmetaliakar.istasyonumnerede.converter;

import com.mehmetaliakar.istasyonumnerede.core.model.SarjIstasyonlari;
import com.mehmetaliakar.istasyonumnerede.dto.request.SarjIstasyonlariRequest;
import com.mehmetaliakar.istasyonumnerede.dto.response.SarjIstasyonlariResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SarjIstasyonlariConverter {
    public static SarjIstasyonlari convertToSarjIstasyonlari(SarjIstasyonlariRequest request){
        SarjIstasyonlari sarjIstasyonlari = new SarjIstasyonlari();
        sarjIstasyonlari.setSarjIstasyonuAdi(request.getSarjIstasyonuAdi());
        sarjIstasyonlari.setSarjIstasyonuNo(request.getSarjIstasyonuNo());
        sarjIstasyonlari.setSarjAgiIsletmecisiUnvan(request.getSarjAgiIsletmecisiUnvan());
        sarjIstasyonlari.setAdresMahalleCaddeSokak(request.getAdresMahalleCaddeSokak());
        sarjIstasyonlari.setSarjIstasyonuMarkaTescilBelgesiMarkaAdi(request.getSarjIstasyonuMarkaTescilBelgesiMarkaAdi());
        sarjIstasyonlari.setHizmetSekli(request.getHizmetSekli());
        return sarjIstasyonlari;
    }

    public static SarjIstasyonlariResponse convertToSarjIstasyonlariResponse(SarjIstasyonlari sarjIstasyonlari)
    {
        SarjIstasyonlariResponse sarjIstasyonlariResponse = new SarjIstasyonlariResponse();
        sarjIstasyonlariResponse.setHizmetSekli(sarjIstasyonlari.getHizmetSekli());
        sarjIstasyonlariResponse.setSarjIstasyonuAdi(sarjIstasyonlari.getSarjIstasyonuAdi());
        sarjIstasyonlariResponse.setSarjAgiIsletmecisiUnvan(sarjIstasyonlari.getSarjAgiIsletmecisiUnvan());
        sarjIstasyonlariResponse.setAdresMahalleCaddeSokak(sarjIstasyonlari.getAdresMahalleCaddeSokak());
        sarjIstasyonlariResponse.setSarjIstasyonuNo(sarjIstasyonlari.getSarjIstasyonuNo());
        sarjIstasyonlariResponse.setSarjIstasyonuMarkaTescilBelgesiMarkaAdi(sarjIstasyonlari.getSarjIstasyonuMarkaTescilBelgesiMarkaAdi());

        return sarjIstasyonlariResponse;
    }
}
