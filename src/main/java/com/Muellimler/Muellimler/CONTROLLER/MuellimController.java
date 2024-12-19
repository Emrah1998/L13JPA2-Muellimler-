package com.Muellimler.Muellimler.CONTROLLER;

import com.Muellimler.Muellimler.MODEL.Request.CreateMuellimRequest;
import com.Muellimler.Muellimler.MODEL.Request.UpdateAgeRequest;
import com.Muellimler.Muellimler.MODEL.Response.MuellimResponse;
import com.Muellimler.Muellimler.SERVICE.MuellimService;
import com.Muellimler.Muellimler.SERVICE.MuellimServiceHandle;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/muellimler")
public class MuellimController {
    private final MuellimServiceHandle muellimService;

    @PostMapping
    public void saveMuellim(@RequestBody CreateMuellimRequest muellim){
        muellimService.saveMuellim(muellim);
    }

    @PatchMapping("/{id}/age")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateMuellimAge(@PathVariable Long id,
                                 @RequestBody UpdateAgeRequest request){
        muellimService.updateMuellimAge(id,request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMuellim(@PathVariable Long id){
        muellimService.deleteMuellim(id);
    }

    @GetMapping("/{id}")
    public MuellimResponse getMuellim(@PathVariable Long id){
        return muellimService.getMuellim(id);
    }
}
