package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "dictionary")
public class Dictionary {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "word")
    private  Set<Word> word;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "dictionary")
    private Set<RelatedWord>  relatedWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Word> getWord() {
        return word;
    }

    public void setWord(Set<Word> word) {
        this.word = word;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<RelatedWord> getRelatedWord() {
        return relatedWord;
    }

    public void setRelatedWord(Set<RelatedWord> relatedWord) {
        this.relatedWord = relatedWord;
    }
}
