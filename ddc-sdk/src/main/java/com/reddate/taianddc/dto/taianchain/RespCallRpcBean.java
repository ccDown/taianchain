package com.reddate.taianddc.dto.taianchain;

import lombok.Data;

@Data
public class RespCallRpcBean {
    private String currentBlockNumber;
    private String output;
    private String status;
}
