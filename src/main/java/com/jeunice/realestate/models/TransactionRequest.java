package com.jeunice.realestate.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Map;

@Data
public class TransactionRequest {
    private String MerchantRequestID;
    private String CheckoutRequestID;
    private int ResultCode;
    private String ResultDesc;
    private CallBackMetadata callBackMetadata;

    public class CallBackMetadata{
        private Map<String, String> Item;
    }


}
