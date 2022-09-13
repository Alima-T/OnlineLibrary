package maven.onlinelibrary.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @Alima-T 13.09.2022
 */

@Entity
@Table(name = "genre", catalog = "library")
@EqualsAndHashCode(of = "genre_id")
@Getter @Setter
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "genre_id")
    private Long genre_id;

    @Column(name = "genre_name")
    private String genre_name;




}
