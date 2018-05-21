package com.sml.order.controller;

import com.sml.order.message.StreamsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by 神迷的亮
 * 2018-05-16 16:14
 */
@RestController
public class SendMessageController
{
    @Autowired
    private StreamsClient streamsClient;

    @GetMapping("/sendMessage")
    public void process()
    {
        String message = "now" + new Date();
        streamsClient.output().send(MessageBuilder.withPayload(message).build());
    }

}
