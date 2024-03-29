package org.dayaway.crazytoaster;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

import org.dayaway.crazytoaster.utill.ActionAd;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher implements ActionAd {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(480, 800);
		config.setForegroundFPS(60);
		config.setTitle(CrazyToaster.TITLE);
		new Lwjgl3Application(new CrazyToaster(new DesktopLauncher()), config);

		/*//TEXTURE PACKER
		TexturePacker.Settings settings=new TexturePacker.Settings();
		settings.alias=true;
		settings.flattenPaths=true;
		TexturePacker.process(settings, "D:\\img\\toasters", "D:\\img\\output","macken.pack");*/

	}

	@Override
	public void showInterAd() {

	}

	@Override
	public void showRewardAd() {

	}
}
