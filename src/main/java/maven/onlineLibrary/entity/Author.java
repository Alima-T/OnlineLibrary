package maven.onlineLibrary.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @Column(name = "author_full_name", nullable = false)
    private String author_full_name;


    @Column(name = "birthday")
    private Date birthday;

    // двухсторонняя связь с Book
//    @Basic(fetch = FetchType.LAZY) // коллекция будет запрашиваться только по требованию (ленивая инициализация)
    @OneToMany(mappedBy = "author") // author должно совпадать с именем поля в классе Book
    private List<Book> books;

    @Override
    public String toString() {
        return  author_full_name;
    }
}
