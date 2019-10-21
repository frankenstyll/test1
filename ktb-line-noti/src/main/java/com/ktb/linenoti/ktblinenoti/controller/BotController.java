package com.ktb.linenoti.ktblinenoti.controller;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

@LineMessageHandler
public class BotController {

    @EventMapping
    public Message handleTextMessage(MessageEvent<TextMessageContent> e) {
		System.out.println("[KtbLineNotiApplication][START]handleTextMessage");
		System.out.println("[KtbLineNotiApplication]" + e);
        TextMessageContent message = e.getMessage();
        System.out.println("[KtbLineNotiApplication][END]handleTextMessage");
        return new TextMessage(message.getText());
    }
}
