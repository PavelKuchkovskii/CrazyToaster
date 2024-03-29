package org.dayaway.crazytoaster;

import org.dayaway.crazytoaster.utill.ActionAd;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;
import org.dayaway.crazytoaster.CrazyToaster;

public class IOSLauncher extends IOSApplication.Delegate implements ActionAd {
    @Override
    protected IOSApplication createApplication() {
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        return new IOSApplication(new CrazyToaster(this), config);
    }

    public static void main(String[] argv) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }

    @Override
    public void showAd() {

    }

    @Override
    public void showRewardAd() {

    }
}
