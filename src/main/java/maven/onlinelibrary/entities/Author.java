package maven.onlinelibrary.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * @Alima-T 13.09.2022
 */
@Entity
@Table(name = "author", catalog = "library")
@EqualsAndHashCode(of = "author_id") // comparison by id only
@Getter
@Setter
@DynamicUpdate //the last 3 annotations allow you not to update the whole DB, but only those fields where were changes
@DynamicInsert
@SelectBeforeUpdate
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // +1 to the new addition
    @Column(name = "author_id")
    private Long id;

    @Column(name = "author_full_name")
    private String full_name;

    private Date birthday;
}
