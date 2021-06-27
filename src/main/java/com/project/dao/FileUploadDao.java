package com.project.dao;

import com.project.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Repository
public interface FileUploadDao {
    @Insert("insert into base_user(file) value(#{file})")
    public void upload(String image);
}
