package inno.escape.moviebatch.domain.boxoffice.entity;

import inno.escape.moviebatch.domain.movie.entity.Movie;
import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "box_office")
public class BoxOffice extends BaseAuditingEntity {

  private static final long serialVersionUID = -4354015219029516786L;

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "id", columnDefinition = "VARCHAR(36)", insertable = false, updatable = false, nullable = false)
  private String id;

  @OneToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;

  @Column(name = "ranking")
  private int ranking;

  @Column(name = "ranked_date")
  private String rankedDate;
}
