package com.mahdi.facialrecognition.servise;

import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_videoio.VideoCapture;
import org.springframework.stereotype.Service;

@Service
public class WebcamService {

    private VideoCapture webcam;

    public WebcamService() {
        webcam = new VideoCapture(0);
    }

    public Mat captureFrame() {
        Mat frame = new Mat();
        webcam.read(frame);
        return frame;
    }
}

