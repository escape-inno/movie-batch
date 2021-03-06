package inno.escape.moviebatch.domain.boxoffice.dto.weekly;

import inno.escape.moviebatch.domain.boxoffice.dto.BoxOfficeResultDto;
import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class WeeklyBoxOfficeResultDto implements Serializable {

  private static final long serialVersionUID = 2447724662597615574L;

  private String boxofficeType;

  private String showRange;

  private String yearWeekTime;

  private List<BoxOfficeResultDto> weeklyBoxOfficeList;
}
