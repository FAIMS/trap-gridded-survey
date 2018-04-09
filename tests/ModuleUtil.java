package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Saving
     */
    public static View get_Saving(Solo solo) {
        String ref = "Saving";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Survey_Unit
     */
    public static View get_SurveyUnit(Solo solo) {
        String ref = "Survey_Unit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Walker
     */
    public static View get_Walker(Solo solo) {
        String ref = "Walker";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Walker_Unit
     */
    public static View get_WalkerUnit(Solo solo) {
        String ref = "Walker_Unit";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Main
     */
    public static View get_Control_Main(Solo solo) {
        String ref = "Control/Main";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Control/Walkers
     */
    public static View get_Control_Walkers(Solo solo) {
        String ref = "Control/Walkers";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/Login
     */
    public static View get_Login_Login(Solo solo) {
        String ref = "Login/Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Saving/Saving
     */
    public static View get_Saving_Saving(Solo solo) {
        String ref = "Saving/Saving";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Survey_Unit/Survey_Unit
     */
    public static View get_SurveyUnit_SurveyUnit(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Survey_Unit/Vars
     */
    public static View get_SurveyUnit_Vars(Solo solo) {
        String ref = "Survey_Unit/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Survey_Unit/Walker_Units
     */
    public static View get_SurveyUnit_WalkerUnits(Solo solo) {
        String ref = "Survey_Unit/Walker_Units";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Walker/Walker
     */
    public static View get_Walker_Walker(Solo solo) {
        String ref = "Walker/Walker";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Walker_Unit/Vars
     */
    public static View get_WalkerUnit_Vars(Solo solo) {
        String ref = "Walker_Unit/Vars";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Walker_Unit/Walker_Unit
     */
    public static View get_WalkerUnit_WalkerUnit(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Main/Add_New_Survey_Unit
     */
    public static View get_Control_Main_AddNewSurveyUnit(Solo solo) {
        String ref = "Control/Main/Add_New_Survey_Unit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Search/Search_Button
     */
    public static View get_Control_Search_SearchButton(Solo solo) {
        String ref = "Control/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Walkers/Add_New_Walker
     */
    public static View get_Control_Walkers_AddNewWalker(Solo solo) {
        String ref = "Control/Walkers/Add_New_Walker";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Walkers/Delete_Selected_Walker
     */
    public static View get_Control_Walkers_DeleteSelectedWalker(Solo solo) {
        String ref = "Control/Walkers/Delete_Selected_Walker";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Walkers/Down
     */
    public static View get_Control_Walkers_Down(Solo solo) {
        String ref = "Control/Walkers/Down";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Walkers/Minus
     */
    public static View get_Control_Walkers_Minus(Solo solo) {
        String ref = "Control/Walkers/Minus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Walkers/Plus
     */
    public static View get_Control_Walkers_Plus(Solo solo) {
        String ref = "Control/Walkers/Plus";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Walkers/Save
     */
    public static View get_Control_Walkers_Save(Solo solo) {
        String ref = "Control/Walkers/Save";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Walkers/Toggle_Selection
     */
    public static View get_Control_Walkers_ToggleSelection(Solo solo) {
        String ref = "Control/Walkers/Toggle_Selection";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Control/Walkers/Up
     */
    public static View get_Control_Walkers_Up(Solo solo) {
        String ref = "Control/Walkers/Up";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Survey_Unit/Survey_Unit/Compute_Artefact_Counts
     */
    public static View get_SurveyUnit_SurveyUnit_ComputeArtefactCounts(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Compute_Artefact_Counts";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Survey_Unit/Walker_Units/Add_New_Walker_Unit
     */
    public static View get_SurveyUnit_WalkerUnits_AddNewWalkerUnit(Solo solo) {
        String ref = "Survey_Unit/Walker_Units/Add_New_Walker_Unit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Add_A_C_M_2
     */
    public static View get_WalkerUnit_WalkerUnit_AddACM2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Add_A_C_M_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Add_Ancient_M_2
     */
    public static View get_WalkerUnit_WalkerUnit_AddAncientM2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Add_Ancient_M_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Add_Daub_M_2
     */
    public static View get_WalkerUnit_WalkerUnit_AddDaubM2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Add_Daub_M_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Add_Glass_M_2
     */
    public static View get_WalkerUnit_WalkerUnit_AddGlassM2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Add_Glass_M_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Add_HM_M_2
     */
    public static View get_WalkerUnit_WalkerUnit_AddHMM2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Add_HM_M_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Add_Lithic_M_2
     */
    public static View get_WalkerUnit_WalkerUnit_AddLithicM2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Add_Lithic_M_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Add_Modern_M_2
     */
    public static View get_WalkerUnit_WalkerUnit_AddModernM2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Add_Modern_M_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Add_Other_M_2
     */
    public static View get_WalkerUnit_WalkerUnit_AddOtherM2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Add_Other_M_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Delete_Row
     */
    public static View get_WalkerUnit_WalkerUnit_DeleteRow(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Delete_Row";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Down
     */
    public static View get_WalkerUnit_WalkerUnit_Down(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Down";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Left
     */
    public static View get_WalkerUnit_WalkerUnit_Left(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Left";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Load
     */
    public static View get_WalkerUnit_WalkerUnit_Load(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Load";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Next_Survey_Unit
     */
    public static View get_WalkerUnit_WalkerUnit_NextSurveyUnit(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Next_Survey_Unit";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Next_Walker_Unit_1
     */
    public static View get_WalkerUnit_WalkerUnit_NextWalkerUnit1(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Next_Walker_Unit_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Next_Walker_Unit_2
     */
    public static View get_WalkerUnit_WalkerUnit_NextWalkerUnit2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Next_Walker_Unit_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Right
     */
    public static View get_WalkerUnit_WalkerUnit_Right(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Right";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Up
     */
    public static View get_WalkerUnit_WalkerUnit_Up(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Up";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Zero_Row_And_Next_1
     */
    public static View get_WalkerUnit_WalkerUnit_ZeroRowAndNext1(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Zero_Row_And_Next_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Walker_Unit/Walker_Unit/Zero_Row_And_Next_2
     */
    public static View get_WalkerUnit_WalkerUnit_ZeroRowAndNext2(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Zero_Row_And_Next_2";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Walker_Unit/Walker_Unit/Chronology
     */
    public static View get_WalkerUnit_WalkerUnit_Chronology(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Chronology";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Walker_Unit/Walker_Unit/N_A
     */
    public static View get_WalkerUnit_WalkerUnit_NA(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/N_A";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Main/Agricultural_Condition
     */
    public static View get_Control_Main_AgriculturalCondition(Solo solo) {
        String ref = "Control/Main/Agricultural_Condition";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Main/Land_Use
     */
    public static View get_Control_Main_LandUse(Solo solo) {
        String ref = "Control/Main/Land_Use";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Main/Slope
     */
    public static View get_Control_Main_Slope(Solo solo) {
        String ref = "Control/Main/Slope";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Main/Topography
     */
    public static View get_Control_Main_Topography(Solo solo) {
        String ref = "Control/Main/Topography";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Main/Visibility
     */
    public static View get_Control_Main_Visibility(Solo solo) {
        String ref = "Control/Main/Visibility";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Control/Search/Entity_Types
     */
    public static View get_Control_Search_EntityTypes(Solo solo) {
        String ref = "Control/Search/Entity_Types";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Survey_Unit/Survey_Unit/Agricultural_Condition
     */
    public static View get_SurveyUnit_SurveyUnit_AgriculturalCondition(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Agricultural_Condition";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Survey_Unit/Survey_Unit/Land_Use
     */
    public static View get_SurveyUnit_SurveyUnit_LandUse(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Land_Use";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Survey_Unit/Survey_Unit/Slope
     */
    public static View get_SurveyUnit_SurveyUnit_Slope(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Slope";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Survey_Unit/Survey_Unit/Topography
     */
    public static View get_SurveyUnit_SurveyUnit_Topography(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Topography";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Survey_Unit/Survey_Unit/Visibility
     */
    public static View get_SurveyUnit_SurveyUnit_Visibility(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Visibility";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Main/Next_Survey_Unit_ID
     */
    public static EditText get_Control_Main_NextSurveyUnitID(Solo solo) {
        String ref = "Control/Main/Next_Survey_Unit_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Main/Number_of_Rows
     */
    public static EditText get_Control_Main_NumberofRows(Solo solo) {
        String ref = "Control/Main/Number_of_Rows";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Main/Number_of_Walkers
     */
    public static View get_Control_Main_NumberofWalkers(Solo solo) {
        String ref = "Control/Main/Number_of_Walkers";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Main/Row_Interval
     */
    public static EditText get_Control_Main_RowInterval(Solo solo) {
        String ref = "Control/Main/Row_Interval";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Main/Walker_Interval
     */
    public static EditText get_Control_Main_WalkerInterval(Solo solo) {
        String ref = "Control/Main/Walker_Interval";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Control/Search/Search_Term
     */
    public static EditText get_Control_Search_SearchTerm(Solo solo) {
        String ref = "Control/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_A_C
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedAC(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_A_C";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_Ancient
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedAncient(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_Ancient";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_Daub
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedDaub(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_Daub";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_Glass
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedGlass(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_Glass";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_HM
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedHM(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_HM";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_Lithic
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedLithic(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_Lithic";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_Modern
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedModern(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_Modern";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_Other
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedOther(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_Other";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Most_Recently_Computed_Total
     */
    public static View get_SurveyUnit_SurveyUnit_MostRecentlyComputedTotal(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Most_Recently_Computed_Total";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Number_of_Rows
     */
    public static View get_SurveyUnit_SurveyUnit_NumberofRows(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Number_of_Rows";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Number_of_Walkers
     */
    public static View get_SurveyUnit_SurveyUnit_NumberofWalkers(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Number_of_Walkers";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Row_Interval_m
     */
    public static View get_SurveyUnit_SurveyUnit_RowIntervalm(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Row_Interval_m";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Survey_Unit_ID
     */
    public static EditText get_SurveyUnit_SurveyUnit_SurveyUnitID(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Survey_Unit_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Walker_Interval_m
     */
    public static View get_SurveyUnit_SurveyUnit_WalkerIntervalm(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Walker_Interval_m";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Survey_Unit/Walkers
     */
    public static View get_SurveyUnit_SurveyUnit_Walkers(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Walkers";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Vars/Highlighted_Row
     */
    public static EditText get_SurveyUnit_Vars_HighlightedRow(Solo solo) {
        String ref = "Survey_Unit/Vars/Highlighted_Row";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Survey_Unit/Vars/Highlighted_Walker
     */
    public static EditText get_SurveyUnit_Vars_HighlightedWalker(Solo solo) {
        String ref = "Survey_Unit/Vars/Highlighted_Walker";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker/Walker/First_Name
     */
    public static EditText get_Walker_Walker_FirstName(Solo solo) {
        String ref = "Walker/Walker/First_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker/Walker/Initials
     */
    public static EditText get_Walker_Walker_Initials(Solo solo) {
        String ref = "Walker/Walker/Initials";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker/Walker/Last_Name
     */
    public static EditText get_Walker_Walker_LastName(Solo solo) {
        String ref = "Walker/Walker/Last_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Vars/Row_Number
     */
    public static View get_WalkerUnit_Vars_RowNumber(Solo solo) {
        String ref = "Walker_Unit/Vars/Row_Number";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Vars/Walker_Number
     */
    public static View get_WalkerUnit_Vars_WalkerNumber(Solo solo) {
        String ref = "Walker_Unit/Vars/Walker_Number";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Vars/Walker_Unit_Survey_Unit_ID
     */
    public static EditText get_WalkerUnit_Vars_WalkerUnitSurveyUnitID(Solo solo) {
        String ref = "Walker_Unit/Vars/Walker_Unit_Survey_Unit_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/A_C
     */
    public static EditText get_WalkerUnit_WalkerUnit_AC(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/A_C";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/Ancient
     */
    public static EditText get_WalkerUnit_WalkerUnit_Ancient(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Ancient";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/Daub
     */
    public static EditText get_WalkerUnit_WalkerUnit_Daub(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Daub";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/Glass
     */
    public static EditText get_WalkerUnit_WalkerUnit_Glass(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Glass";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/HM
     */
    public static EditText get_WalkerUnit_WalkerUnit_HM(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/HM";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/Lithic
     */
    public static EditText get_WalkerUnit_WalkerUnit_Lithic(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Lithic";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/Modern
     */
    public static EditText get_WalkerUnit_WalkerUnit_Modern(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Modern";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/Notes
     */
    public static EditText get_WalkerUnit_WalkerUnit_Notes(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Walker_Unit/Walker_Unit/Other
     */
    public static EditText get_WalkerUnit_WalkerUnit_Other(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Other";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Control/Search/Entity_List
     */
    public static View get_Control_Search_EntityList(Solo solo) {
        String ref = "Control/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Login/Login/User
     */
    public static View get_Login_Login_User(Solo solo) {
        String ref = "Login/Login/User";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Control/Main/Drainage
     */
    public static View get_Control_Main_Drainage(Solo solo) {
        String ref = "Control/Main/Drainage";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Control/Main/Passability
     */
    public static View get_Control_Main_Passability(Solo solo) {
        String ref = "Control/Main/Passability";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Control/Main/Shade
     */
    public static View get_Control_Main_Shade(Solo solo) {
        String ref = "Control/Main/Shade";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Control/Main/Stoniness
     */
    public static View get_Control_Main_Stoniness(Solo solo) {
        String ref = "Control/Main/Stoniness";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Control/Main/Vegetation
     */
    public static View get_Control_Main_Vegetation(Solo solo) {
        String ref = "Control/Main/Vegetation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Survey_Unit/Survey_Unit/Drainage
     */
    public static View get_SurveyUnit_SurveyUnit_Drainage(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Drainage";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Survey_Unit/Survey_Unit/Passability
     */
    public static View get_SurveyUnit_SurveyUnit_Passability(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Passability";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Survey_Unit/Survey_Unit/Shade
     */
    public static View get_SurveyUnit_SurveyUnit_Shade(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Shade";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Survey_Unit/Survey_Unit/Stoniness
     */
    public static View get_SurveyUnit_SurveyUnit_Stoniness(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Stoniness";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Survey_Unit/Survey_Unit/Vegetation
     */
    public static View get_SurveyUnit_SurveyUnit_Vegetation(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Vegetation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Walker_Unit/Walker_Unit/Fragmentation
     */
    public static View get_WalkerUnit_WalkerUnit_Fragmentation(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Fragmentation";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Walker_Unit/Walker_Unit/Load_Walker
     */
    public static View get_WalkerUnit_WalkerUnit_LoadWalker(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Load_Walker";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: radio
        Ref:  Walker_Unit/Walker_Unit/Wear
     */
    public static View get_WalkerUnit_WalkerUnit_Wear(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Wear";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Control/Main/Guide_Defaults
     */
    public static View get_Control_Main_GuideDefaults(Solo solo) {
        String ref = "Control/Main/Guide_Defaults";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Control/Walkers/Walker_Guide
     */
    public static View get_Control_Walkers_WalkerGuide(Solo solo) {
        String ref = "Control/Walkers/Walker_Guide";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Control/Walkers/Walkers
     */
    public static View get_Control_Walkers_Walkers(Solo solo) {
        String ref = "Control/Walkers/Walkers";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Saving/Saving/Saving
     */
    public static View get_Saving_Saving_Saving(Solo solo) {
        String ref = "Saving/Saving/Saving";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Survey_Unit/Survey_Unit/Sep_Most_Recently_Computed
     */
    public static View get_SurveyUnit_SurveyUnit_SepMostRecentlyComputed(Solo solo) {
        String ref = "Survey_Unit/Survey_Unit/Sep_Most_Recently_Computed";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Walker/Walker/Help
     */
    public static View get_Walker_Walker_Help(Solo solo) {
        String ref = "Walker/Walker/Help";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Walker_Unit/Walker_Unit/Grid
     */
    public static View get_WalkerUnit_WalkerUnit_Grid(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Grid";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Walker_Unit/Walker_Unit/Guide_Counts
     */
    public static View get_WalkerUnit_WalkerUnit_GuideCounts(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Guide_Counts";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Walker_Unit/Walker_Unit/Survey_Unit_ID
     */
    public static View get_WalkerUnit_WalkerUnit_SurveyUnitID(Solo solo) {
        String ref = "Walker_Unit/Walker_Unit/Survey_Unit_ID";
        return (android.view.View) solo.getView((Object) ref);
    }
}
