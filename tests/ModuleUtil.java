package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Test
     */
    public static View get_Test(Solo solo) {
        String ref = "Test";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Test/Test
     */
    public static View get_Test_Test(Solo solo) {
        String ref = "Test/Test";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Test/Test/Button
     */
    public static View get_Test_Test_Button(Solo solo) {
        String ref = "Test/Test/Button";
        return (android.view.View) solo.getView((Object) ref);
    }
}
