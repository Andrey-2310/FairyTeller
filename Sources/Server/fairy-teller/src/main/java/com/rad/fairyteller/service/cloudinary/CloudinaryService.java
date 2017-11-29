package com.rad.fairyteller.service.cloudinary;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CloudinaryService {

    private Cloudinary cloudinary;

    @Autowired
    public CloudinaryService(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    public String getPhoto(String image) {
        try {
            return cloudinary.uploader().upload(image, com.cloudinary.utils.ObjectUtils.emptyMap()).get("url").toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}