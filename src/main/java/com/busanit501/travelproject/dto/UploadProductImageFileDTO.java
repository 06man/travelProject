package com.busanit501.travelproject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadProductImageFileDTO {

  @NotNull
  private MultipartFile file;

  @NotBlank
  private String countryDst;

  @NotBlank
  private String cityDst;

}
