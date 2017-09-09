package design.actor.mediator;

import java.util.Date;

/**
 * Created by jianweilin on 2017/9/9.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);

    }
}
