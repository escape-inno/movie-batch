package inno.escape.moviebatch.domain.boxoffice.dto.daily;

import inno.escape.moviebatch.domain.boxoffice.dto.BoxOfficeResult;
import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class DailyBoxOfficeResult implements Serializable {

  private static final long serialVersionUID = 9003651971396355972L;

  private String boxofficeType;

  private String showRange;

  private List<BoxOfficeResult> dailyBoxOfficeList;
}