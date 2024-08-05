package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "topic_t")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "credit", nullable = false) // Đảm bảo không cho phép null
    private Integer credit;

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }  // Đổi từ topicName thành name

    public Integer getCredit() { return credit; }
    public void setCredit(Integer credit) { this.credit = credit; }
}
