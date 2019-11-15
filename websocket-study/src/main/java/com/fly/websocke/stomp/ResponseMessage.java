package com.fly.websocke.stomp;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by sang on 16-12-22.
 */
@Data
public class ResponseMessage implements Serializable {
    private static final long serialVersionUID = -8669039206899684602L;
    private String responseMessage;

    public ResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

}
