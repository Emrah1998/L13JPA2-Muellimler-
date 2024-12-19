package com.Muellimler.Muellimler.SERVICE;

import com.Muellimler.Muellimler.MODEL.Request.CreateMuellimRequest;
import com.Muellimler.Muellimler.MODEL.Request.UpdateAgeRequest;
import com.Muellimler.Muellimler.MODEL.Response.MuellimResponse;

public interface MuellimService {
    void saveMuellim(CreateMuellimRequest muellim);
    void updateMuellimAge(Long id, UpdateAgeRequest request);
    void deleteMuellim(Long id);
    MuellimResponse getMuellim(Long id);
}
