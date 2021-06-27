package com.project.service.Impl;

import com.project.dao.FileUploadDao;
import com.project.domain.OutContract;
import com.project.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service
public class FileUploadServiceImpl implements FileUploadService {
    @Autowired
    FileUploadDao fileUploadDao;
    @Override
    public void save(String image) {
        fileUploadDao.upload(image);
    }
}
