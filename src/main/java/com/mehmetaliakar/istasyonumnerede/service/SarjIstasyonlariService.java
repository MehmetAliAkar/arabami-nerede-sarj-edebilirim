package com.mehmetaliakar.istasyonumnerede.service;

import com.mehmetaliakar.istasyonumnerede.converter.SarjIstasyonlariConverter;
import com.mehmetaliakar.istasyonumnerede.core.model.SarjIstasyonlari;
import com.mehmetaliakar.istasyonumnerede.dto.request.SarjIstasyonlariRequest;
import com.mehmetaliakar.istasyonumnerede.dto.response.SarjIstasyonlariResponse;
import com.mehmetaliakar.istasyonumnerede.repository.SarjIstasyonlariRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SarjIstasyonlariService {
    private final SarjIstasyonlariRepository sarjIstasyonlariRepository;

    public List<SarjIstasyonlariResponse> createSarjList(List<SarjIstasyonlariRequest> requestList) {
        List<SarjIstasyonlari> sarjIstasyonlariList = new ArrayList<>();
        for (SarjIstasyonlariRequest request : requestList) {
            SarjIstasyonlari sarjIstasyon = SarjIstasyonlariConverter.convertToSarjIstasyonlari(request);
            sarjIstasyonlariList.add(sarjIstasyon);
        }
        List<SarjIstasyonlari> savedSarjIstasyonlari = sarjIstasyonlariRepository.saveAll(sarjIstasyonlariList);
        List<SarjIstasyonlariResponse> responseList = new ArrayList<>();
        for (SarjIstasyonlari sarjIstasyon : savedSarjIstasyonlari) {
            responseList.add(SarjIstasyonlariConverter.convertToSarjIstasyonlariResponse(sarjIstasyon));
        }
        return responseList;
    }

}
