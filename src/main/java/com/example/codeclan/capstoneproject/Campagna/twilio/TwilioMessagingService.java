package com.example.codeclan.capstoneproject.Campagna.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.beans.factory.annotation.Value;

public class TwilioMessagingService {

    @Value("${ACCOUNT_SID}")
    private static String ACCOUNT_SID;

    @Value("${AUTH_TOKEN}")
    private static String AUTH_TOKEN;

    // Find your Account Sid and Token at twilio.com/console
    public static void main(String number, String body) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(number),
                        "MG27a544a4ae6d327987476c605f0e9a0c",
                        body)
                .create();

        System.out.println(message.getSid());
    }

}