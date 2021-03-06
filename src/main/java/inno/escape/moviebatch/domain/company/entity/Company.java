package inno.escape.moviebatch.domain.company.entity;

import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "company")
public class Company extends BaseAuditingEntity {

  @Id
  @Column(name = "code", columnDefinition = "VARCHAR(36)", updatable = false, nullable = false)
  private String code;

  @Column(name = "korea_name")
  private String koreaName;

  @Column(name = "english_name")
  private String englishName;

  @Column(name = "ceo_name")
  private String ceoName;
}
