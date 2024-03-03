package com.mehmetaliakar.istasyonumnerede.controller;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.mehmetaliakar.istasyonumnerede.core.model.SarjIstasyonlari;
import com.mehmetaliakar.istasyonumnerede.dto.request.SarjIstasyonlariRequest;
import com.mehmetaliakar.istasyonumnerede.dto.response.SarjIstasyonlariResponse;
import com.mehmetaliakar.istasyonumnerede.service.SarjIstasyonlariService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.mehmetaliakar.istasyonumnerede.core.endpoints.BaseEndpoints.Base;

@RestController
@RequestMapping(Base + "/sarjIstasyonlariSorgulaPublic")
@RequiredArgsConstructor
public class SarjIstasyonlariController {
    private final SarjIstasyonlariService sarjIstasyonlariService;

    @PostMapping
    public List<SarjIstasyonlariResponse> createSarjList(@RequestBody List<SarjIstasyonlariRequest> requestList) {
        return sarjIstasyonlariService.createSarjList(requestList);
    }

}
