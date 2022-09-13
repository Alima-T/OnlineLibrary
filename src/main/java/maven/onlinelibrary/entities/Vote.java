package maven.onlinelibrary.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;

/**
 * @Alima-T 13.09.2022
 */
@Entity
@Table(name = "vote", catalog = "library")
@EqualsAndHashCode(of = "vote_id")
@Getter
@Setter
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vote_id")
    private Long vote_id;

    @Column(name="value")
    private int value;

    @Column(name="book_id")
    private Long book_id;

    @Column(name="username")
    private String username;

}
