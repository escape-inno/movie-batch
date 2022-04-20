package inno.escape.moviebackend.domain.company.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import inno.escape.moviebackend.domain.company.dto.info.CompanyInfoRequestDto;
import inno.escape.moviebackend.domain.company.dto.info.CompanyInfoResponseDto;
import inno.escape.moviebackend.domain.company.dto.list.CompanyListRequestDto;
import inno.escape.moviebackend.domain.company.dto.list.CompanyListResponseDto;
import inno.escape.moviebackend.global.Constants.URL_PATH;
import inno.escape.moviebackend.global.util.MultiValueMapUtil;
import inno.escape.moviebackend.global.util.WebClientUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CompanyServiceImpl implements CompanyService {

  private final ObjectMapper objectMapper;

  @Override
  public Mono<CompanyListResponseDto> getCompanies(CompanyListRequestDto dto) {
    MultiValueMap<String, String> listValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return WebClientUtil.getResponseSpec(URL_PATH.COMPANY_LIST.getValue(), listValueMap)
        .bodyToMono(CompanyListResponseDto.class);
  }

  @Override
  public Mono<CompanyInfoResponseDto> getCompany(CompanyInfoRequestDto dto) {
    MultiValueMap<String, String> infoValueMap = MultiValueMapUtil.convert(objectMapper, dto);

    return WebClientUtil.getResponseSpec(URL_PATH.COMPANY_INFO.getValue(), infoValueMap)
        .bodyToMono(CompanyInfoResponseDto.class);
  }
}
