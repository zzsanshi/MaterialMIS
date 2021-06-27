package com.project.service;

import com.project.domain.OutContract;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileUploadService {
    public void save(String image);
}
