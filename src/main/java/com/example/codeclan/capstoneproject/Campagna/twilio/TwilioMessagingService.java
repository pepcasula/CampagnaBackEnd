package com.example.codeclan.capstoneproject.Campagna.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class TwilioMessagingService {

        // Find your Account Sid and Token at twilio.com/console
        public static final String ACCOUNT_SID = "AC3d74786398ced5844c70ae8e060cc0d2";
        public static final String AUTH_TOKEN = "[AuthToken]";

        public static void main(String[] args) {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                            new com.twilio.type.PhoneNumber("+447769864725"),
                            "MG27a544a4ae6d327987476c605f0e9a0c",
                            "This is a test")
                    .create();

            System.out.println(message.getSid());
        }

}
