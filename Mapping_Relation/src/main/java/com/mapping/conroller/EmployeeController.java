package com.mapping.conroller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapping.modal.Employee;
import com.mapping.modal.EmployeeImage;
import com.mapping.repository.EmployeeRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	
	@Value("${upload.dir}")
    private String uploadDir;

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> saveEmployee(
            @RequestPart("employee") String employeeData,
            @RequestPart("image") MultipartFile imageFile) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(employeeData, Employee.class);

        // Save image file
        String fileName = UUID.randomUUID() + "_" + imageFile.getOriginalFilename();
        Path filePath = Paths.get(uploadDir, fileName);
        Files.copy(imageFile.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

        EmployeeImage image = new EmployeeImage();
        image.setFileName(fileName);
        image.setFileType(imageFile.getContentType());
        image.setFilePath(filePath.toString());

        employee.setImage(image);

        Employee saved = employeeRepository.save(employee);
        return ResponseEntity.ok(saved);
    }
}
