package com.account.accountsapp.purchase;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BtcChangeConsumer {

    //  private final OrderService orderService;


    @KafkaListener(topics = "btc-price")
    public void listenBtcChange(String message) throws JsonProcessingException {
        final BTCPrice btcPrice = new ObjectMapper().readValue(message, BTCPrice.class);
        log.info("Received new Btc-Price" + btcPrice);
        //orderService.purchaseOrdersForNewPrice(btcPrice);
    }
}
