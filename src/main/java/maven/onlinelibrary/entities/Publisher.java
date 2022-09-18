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
@Table(name = "зublisher", catalog = "library")
@EqualsAndHashCode(of = "publisher_id")
@Getter
@Setter
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private Long publisher_id;

    @Column(name = "publisher_name")
    private String publisher_name;

    @Override
    public String toString() {
        return publisher_name;
    }
}
