package kz.education.entplatform.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "subjects")
@Data
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 4)
    private byte product;

    @Column(nullable = false)
    private String title;

    @Column(name = "class", length = 4)
    private byte clas;

    @Column(length = 1)
    private byte is_necessarily;

    @Column(length = 4)
    private byte language;

    @Column(length = 4)
    private byte q_count;

}
