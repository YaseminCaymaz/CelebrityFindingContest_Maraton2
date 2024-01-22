package com.yasemin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tblcontest")
public class Contest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Contestant contestant;
    Long startTime;
    Long endTime;
    int score;
}
