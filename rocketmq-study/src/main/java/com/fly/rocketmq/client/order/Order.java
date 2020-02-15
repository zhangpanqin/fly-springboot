package com.fly.rocketmq.client.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2020-02-08-22:45
 * @description 订单
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order implements Serializable {
    private static final long serialVersionUID = 1056199695401893672L;
    private String id;
    private String message;
}
