package inno.escape.moviebackend.domain.company.dto.info;

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
public class CompanyInfoResponseDto implements Serializable {

  private CompanyInfoResult companyInfoResult;
}