package com.fly.websocke.stomp;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by sang on 16-12-22.
 */
@Data
public class RequestMessage implements Serializable {

    private static final long serialVersionUID = 1373596491639276503L;
    private String name;

}
