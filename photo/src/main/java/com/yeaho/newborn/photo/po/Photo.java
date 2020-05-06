package com.yeaho.newborn.photo.po;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : yeaho_lee
 * @Description : TODO
 * @createTime : 2020年05月06日 15:21
 */
@Entity
public class Photo {

    @Id
    @GeneratedValue(generator = "gen")
    @GenericGenerator(
            name = "gen",
            strategy = "uuid",
            parameters={
                    @Parameter(name="separator",value="_")
            })
    private String id;

    private String address;

    private String name;

    @Column
    private Date createTimestamp;

    @Column
    private Date lastUpdateTimestamp;

    @PrePersist
    public void updateWhenCreate(){
        createTimestamp = Calendar.getInstance().getTime();
        lastUpdateTimestamp = Calendar.getInstance().getTime();
    }

    @PreUpdate
    public void updateWhenUpdate(){
        lastUpdateTimestamp = Calendar.getInstance().getTime();
    }
}
