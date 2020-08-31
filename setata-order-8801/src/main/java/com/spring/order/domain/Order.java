package com.spring.order.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private  int id;
    private  int  user_id;
    private  int  chanpin_id;
    private  int  count;
    private  String jine;
    private  String status;

}
