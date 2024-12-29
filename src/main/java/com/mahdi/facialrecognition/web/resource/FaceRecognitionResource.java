package com.mahdi.facialrecognition.web.resource;

import com.mahdi.facialrecognition.servise.FaceRecognitionService;
import com.mahdi.facialrecognition.web.remote.FaceRecognitionRemote;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.google.cloud.vision.v1.FaceAnnotation;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/face")
public class FaceRecognitionResource implements FaceRecognitionRemote {

    private final FaceRecognitionService faceRecognitionService;

    @Override
    public ResponseEntity<?> detectFaces(@RequestParam("image") MultipartFile image) {
        try {
            List<FaceAnnotation> faces = faceRecognitionService.detectFaces(image);
            if (faces == null || faces.isEmpty()){
                return new ResponseEntity<>("No faces detected or error during processing", HttpStatus.OK);
            }
            return new ResponseEntity<>(faces, HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>("Error processing image: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}



