package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wordId")
    private Long id;

    private String word;
    @ManyToOne
    private Dictionary dictionary;
    @OneToOne(mappedBy = "word")
    private RelatedWord relatedWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public RelatedWord getRelatedWord() {
        return relatedWord;
    }

    public void setRelatedWord(RelatedWord relatedWord) {
        this.relatedWord = relatedWord;
    }
}
