package inno.escape.moviebatch.global.model.dto;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class DirectorDto implements Serializable {

  private static final long serialVersionUID = 659751890165584695L;

  private String peopleNm;

  private String peopleNmEn;
}