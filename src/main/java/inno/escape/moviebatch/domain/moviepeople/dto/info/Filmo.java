package inno.escape.moviebatch.domain.moviepeople.dto.info;

import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class Filmo implements Serializable {

    private static final long serialVersionUID = 6852281635082888388L;

    private String movieCd;

    private String movieNm;

    private String moviePartNm;
}
