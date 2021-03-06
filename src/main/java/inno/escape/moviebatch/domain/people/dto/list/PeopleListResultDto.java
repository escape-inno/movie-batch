package inno.escape.moviebatch.domain.people.dto.list;

import java.io.Serializable;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleListResultDto implements Serializable {

  private static final long serialVersionUID = 3393125919202873051L;

  private int totCnt;

  private List<PeopleListDto> peopleList;

  private String source;
}
