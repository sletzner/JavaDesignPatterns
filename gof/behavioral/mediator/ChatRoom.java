/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.mediator;

import java.util.Date;

/**
 * @author Stefan Letzner
 *
 */
public class ChatRoom {

	public static void showMessage(User user, String message){
		System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message); 
	}
	
}
