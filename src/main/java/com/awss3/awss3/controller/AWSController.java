package com.awss3.awss3.controller;

import com.awss3.awss3.controller.service.AWSS3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class AWSController {

    @Autowired
    private AWSS3Service awss3Service;

    @GetMapping("/aws-s3")
    public String getAWSS3(){
        awss3Service.getS3Buckets();
        return "Welcome to the AWS S3 world";
    }
}
