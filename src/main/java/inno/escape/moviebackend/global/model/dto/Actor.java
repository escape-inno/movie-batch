package inno.escape.moviebackend.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class Actor implements Serializable {

  private String peopleNm;

  private String peopleNmEn;

  private String cast;

  private String castEn;
}