package inno.escape.moviebatch.domain.boxoffice.dto.daily;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class DailyBoxOfficeRequestDto implements Serializable {

  private static final long serialVersionUID = 7358660659213522364L;

  @NotBlank(message = "발급받은 키 값을 입력해주세요.")
  private String key;

  @Pattern(regexp = "((19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01]))", message = "조회하고자 하는 날짜를 yyyymmdd 형식으로 입력해주세요.")
  @NotBlank(message = "조회하고자 하는 날짜를 입력해주세요.")
  private String targetDt;

  // default 10 / max 10
  private String itemPerPage;

  // default 전체 / Y 다양성 영화 / N 상업 영화
  private String multiMovieYn;

  // default 전체 / K 한국 영화 / F 외국 영화
  private String repNationCd;

  // default 전체
  // 공통코드 조회 서비스에서 "0105000000" 로서 조회된 코드 => 0105001 서울시 ~ 0105017 세종시
  private String wideAreaCd;
}
