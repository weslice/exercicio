package com.uaubox.UAUBox.controller;

import com.uaubox.UAUBox.dto.RequestDTO;
import com.uaubox.UAUBox.dto.ResponseDTO;
import com.uaubox.UAUBox.entity.FaleMaisPlan;
import com.uaubox.UAUBox.service.FaleMaisPlanService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/call")
@AllArgsConstructor
public class CallController {

    private FaleMaisPlanService faleMaisPlanService;

    @PostMapping(value = "/calculate")
    public ResponseEntity<ResponseDTO> searchByName(@RequestBody RequestDTO requestData) {
        try {
            return new ResponseEntity<>(faleMaisPlanService.calculateCallPrice(requestData), HttpStatus.OK);
        } catch (RuntimeException ex) {
            var errorResponse = new ResponseDTO(null, Collections.singletonList(ex.getMessage()), ex.getMessage());
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}
