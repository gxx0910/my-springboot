package com.gxx;

import com.sun.org.apache.xpath.internal.operations.String;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by 11246 on 2017/12/7  0007.
 */
@Entity
@Data
public class Girl implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer age;
    private transient String cupSize;
    private BigDecimal money;
    private java.lang.String str;

}


