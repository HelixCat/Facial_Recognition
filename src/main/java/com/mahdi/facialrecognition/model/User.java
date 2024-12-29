package com.mahdi.facialrecognition.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_user")
public class User {

    String name;
    float[] embedding;
}
