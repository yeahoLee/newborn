package com.yeaho.newborn.photo.po;

import lombok.Data;
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
@Data
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

    /**
     * 存放地址
     */
    private String address;

    /**
     * 照片名
     */
    private String name;

    /**
     * 照片简介
     */
    private String introduction;

    /**
     * 上传人
     */
    private String createBy;

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
