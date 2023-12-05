package kz.education.entplatform.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "question_details")
@Data
@NoArgsConstructor
public class QuestionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(name = "explanation")
    private String explanation;

    @Column(name = "source")
    private String source;

    @Column(name = "question")
    private String questionText;

    @Column(name = "answers", nullable = false)
    private String answers;

    @Column(name = "var1", nullable = false)
    private String var1;

    @Column(name = "var2", nullable = false)
    private String var2;

    @Column(name = "var3", nullable = false)
    private String var3;

    @Column(name = "var4")
    private String var4;

    @Column(name = "var5")
    private String var5;

    @Column(name = "var6")
    private String var6;

    @Column(name = "var7")
    private String var7;

    @Column(name = "var8")
    private String var8;

    @Column(name = "var9")
    private String var9;

    @Column(name = "var10")
    private String var10;

}
