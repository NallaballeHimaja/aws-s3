package com.awss3.awss3.controller.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import jdk.internal.instrumentation.Logger;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class AWSS3Service {



    public void getS3Buckets(){
        AWSCredentials credentials = new BasicAWSCredentials("","");
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                            .withCredentials(new AWSStaticCredentialsProvider(credentials))
                            .withRegion("")
                            .build();
        List<Bucket> bucketList = s3Client.listBuckets();

        for(Bucket bucket:bucketList){
            System.out.println(bucket.getName());
        }

        /*ObjectListing objectListing = s3Client.listObjects("himajapaystubs");
        for(S3ObjectSummary os : objectListing.getObjectSummaries()) {
           System.out.println(os.getKey());
        }
        s3Client.putObject(
                "docs",
                "Java Interview Programs.docx",
                new File("C:\\Chandra\\Java Interview Programs.docx")
        );*/
    }
}
