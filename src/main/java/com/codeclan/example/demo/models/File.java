package com.codeclan.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "files")

public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size")
    private int size;

    @JsonIgnoreProperties(value = "files")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public File(String name, String extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.folder = folder;
        this.size = size;
    }

    public File() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
