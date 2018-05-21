package com.sml.order.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by 神迷的亮
 * 2018-05-16 16:11
 */
public interface StreamsClient
{
    String message = "myMessage";

//    @Input(StreamsClient.message)
//    SubscribableChannel input();

    @Output(StreamsClient.message)
    MessageChannel output();
}
