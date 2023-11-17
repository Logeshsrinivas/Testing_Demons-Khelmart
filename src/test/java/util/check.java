package util;

import action.LoginPageAction;

public class check {

	public static void main(String[] args) {
		Dataproperties data = new Dataproperties();
		LoginPageAction objLogin = new LoginPageAction();
		
		System.out.println(data.url);
          System.out.println("objLogin.signout");
          System.out.println(data.email);
	}

}
