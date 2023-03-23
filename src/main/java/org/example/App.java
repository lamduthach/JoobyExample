package org.example;

import io.jooby.Jooby;

public class App extends Jooby {

	{
		get("/", ctx -> "OK");
	}

	public static void main(String[] args) {
		runApp(args, App::new);
	}
}