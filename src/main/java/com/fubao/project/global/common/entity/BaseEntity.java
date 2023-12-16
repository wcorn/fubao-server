package com.fubao.project.global.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createDate = LocalDateTime.now();
    @Column(name = "updated_at")
    @LastModifiedDate
    private LocalDateTime modifyDate = LocalDateTime.now();

}
