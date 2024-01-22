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
@Table(name = "tblcelebrity_info")
public class CelebrityInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String info;
    @ManyToOne
    Celebrity celebrity;
}
