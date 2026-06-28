package com.sanzsolutions.content;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class InfoItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @NotBlank private String category;
    @NotBlank private String title;
    @Column(length = 1000) private String description;
    private int displayOrder;
    protected InfoItem() {}
    public InfoItem(String category, String title, String description, int displayOrder) { this.category = category; this.title = title; this.description = description; this.displayOrder = displayOrder; }
    public Long getId() { return id; }
    public String getCategory() { return category; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getDisplayOrder() { return displayOrder; }
}
