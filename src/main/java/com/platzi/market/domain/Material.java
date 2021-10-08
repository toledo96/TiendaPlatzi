package com.platzi.market.domain;

import com.platzi.market.persistence.entity.Alumno;
import com.platzi.market.persistence.entity.Archivo;

import java.util.List;

public class Material {

    private int materialId;

    private String name;

    private List<Student> students;

    private List<File> files;

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
