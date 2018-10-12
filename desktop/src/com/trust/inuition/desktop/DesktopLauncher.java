package com.trust.inuition.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.trust.inuition.TrustYourInuition;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Trust your Inuition";
		config.width=800;
		config.height=480;
		new LwjglApplication(new TrustYourInuition(), config);
	}
}
