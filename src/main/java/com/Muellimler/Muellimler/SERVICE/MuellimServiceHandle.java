package com.Muellimler.Muellimler.SERVICE;

import com.Muellimler.Muellimler.DAO.Entity.MuellimEntity;
import com.Muellimler.Muellimler.DAO.Repository.MuellimRepository;
import com.Muellimler.Muellimler.MODEL.Enum.MuellimStatus;
import com.Muellimler.Muellimler.MODEL.Request.CreateMuellimRequest;
import com.Muellimler.Muellimler.MODEL.Request.UpdateAgeRequest;
import com.Muellimler.Muellimler.MODEL.Response.MuellimResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MuellimServiceHandle implements MuellimService {

    private final MuellimRepository muellimRepository;

    @Override
    public void saveMuellim(CreateMuellimRequest muellim) {
        muellimRepository.save(
                MuellimEntity.builder()
                        .name(muellim.getName())
                        .surname(muellim.getSurname())
                        .age(muellim.getAge())
                        .build()
        );
    }

    @Override
    public void updateMuellimAge(Long id, UpdateAgeRequest request) {
        var muellim = fetchMuellimIfExist(id);
        muellim.setAge(request.getAge());
        muellimRepository.save(muellim);
    }

    @Override
    public void deleteMuellim(Long id) {
        var muellim =fetchMuellimIfExist(id);
        muellim.setStatus(MuellimStatus.DELETED);
        muellimRepository.save(muellim);
    }

    @Override
    public MuellimResponse getMuellim(Long id) {
        var muellim= fetchMuellimIfExist(id);

        return new MuellimResponse(muellim.getName(), muellim.getSurname(), muellim.getAge());
    }

    private MuellimEntity fetchMuellimIfExist(Long id){
        return     muellimRepository.findByMuellimIdAndStatusNot(id)
                .orElseThrow(RuntimeException::new);
    }
}
