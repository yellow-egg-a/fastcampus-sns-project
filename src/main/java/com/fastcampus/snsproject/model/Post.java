package com.fastcampus.snsproject.model;

import com.fastcampus.snsproject.model.entity.PostEntity;
import com.fastcampus.snsproject.model.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class Post {
    private Integer id;
    private String title;
    private String body;
    private User user;
    private Timestamp registeredAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    /*
     * Entity를 DTO로 변환해주는 메소드
     * */
    public static Post fromEntity(PostEntity entity) {
        return new Post(
                entity.getId(),
                entity.getTitle(),
                entity.getBody(),
                User.fromEntity(entity.getUser()),
                entity.getRegisteredAt(),
                entity.getUpdatedAt(),
                entity.getDeletedAt()
        );
    }
}
