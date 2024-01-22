package com.yasemin.entity;

import com.yasemin.utility.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tblcelebrity")
public class Celebrity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String image;
    @Enumerated(EnumType.STRING)
    Gender gender;
    String nationalitie;
    String job;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "celebrity")
    List<CelebrityInfo> celebrityInfo;
}
