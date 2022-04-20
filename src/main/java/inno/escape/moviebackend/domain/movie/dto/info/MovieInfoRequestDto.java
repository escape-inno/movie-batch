package inno.escape.moviebackend.domain.movie.dto.info;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieInfoRequestDto implements Serializable {

  @NotBlank(message = "발급받은 키 값을 입력해주세요.")
  private String key;

  @NotBlank(message = "영화 코드 번호를 입력해주세요.")
  private String movieCd;
}