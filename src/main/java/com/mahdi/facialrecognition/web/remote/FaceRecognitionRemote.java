package com.mahdi.facialrecognition.web.remote;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface FaceRecognitionRemote {


    @PostMapping("/detect")
    ResponseEntity<?> detectFaces(@RequestParam("image") MultipartFile image);
}
