package maven.onlineLibrary.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;


/**
 * @Alima-T 9/17/2022
 */
@Entity
@Table(name = "book", catalog = "library")
@EqualsAndHashCode(of = "book_id")
@Getter@Setter
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
@NoArgsConstructor
public class Book {

    public Book(Long book_id, String title, int page_count, String isbn, Author author, Genre genre, Publisher publisher, int publish_year, byte[] image, int avg_rating, int total_vote_count, Long total_rating, Long view_count, String description) {
        this.book_id = book_id;
        this.title = title;
        this.page_count = page_count;
        this.isbn = isbn;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.publish_year = publish_year;
        this.image = image;
        this.avg_rating = avg_rating;
        this.total_vote_count = total_vote_count;
        this.total_rating = total_rating;
        this.view_count = view_count;
        this.description = description;
    }

    public Book(Long book_id, byte[] image) {
        this.book_id = book_id;
        this.image = image;
    }

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    @Column(name = "title")
    private String title;

    @Lob //LOBs (large objects)-db types, used to store large amounts of data (max 4 Gb) such as ASCII text, text in National Characters, graphics formats, sound/video forms.
    @Column(name = "content")
    private byte[] content; //longblob to byte system

    @Column(name = "page_count")
    private int page_count;

    @Column(name = "isbn")
    private String isbn;

    @ManyToOne
    @JoinColumn
    private Author author;

    @ManyToOne
    @JoinColumn
    private Genre genre;

    @ManyToOne
    @JoinColumn
    private Publisher publisher;

    @Column(name = "publish_year")
    private int publish_year;

    @Lob
    @Column(name = "image")
    private byte[] image; //longblob to byte system

    @Column(name = "avg_rating")
    private int avg_rating;

    @Column(name = "total_vote_count")
    private int total_vote_count;

    @Column(name = "total_rating")
    private Long total_rating;

    @Column(name = "view_count")
    private Long view_count;

    @Column(name = "description")
    private String description;

    @Override
    public String toString() {return title;}
}
