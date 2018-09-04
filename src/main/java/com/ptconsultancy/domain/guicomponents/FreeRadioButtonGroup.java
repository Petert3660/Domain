package com.ptconsultancy.domain.guicomponents;

import static com.ptconsultancy.domain.guicomponents.GuiConstants.TRUE;

import java.util.ArrayList;
import javax.swing.ButtonGroup;

public class FreeRadioButtonGroup extends ButtonGroup {

    ArrayList<FreeRadioButton> allButtons;

    public FreeRadioButtonGroup() {
    }

    public FreeRadioButtonGroup(ArrayList<FreeRadioButton> radioButtons) {
        for (FreeRadioButton frb : radioButtons) {
            this.add(frb);
        }
        allButtons = radioButtons;
    }

    public void setSelectedButton(int order) {
        this.setSelected(allButtons.get(order).getModel(), TRUE);
    }

    public String getSelectedButton() {
        return this.getSelection().getActionCommand();
    }

    public void addButtons(ArrayList<FreeRadioButton> radioButtons) {
        for (FreeRadioButton frb : radioButtons) {
            this.add(frb);
        }
        allButtons = radioButtons;
    }

    public ArrayList<FreeRadioButton> getButtons() { return allButtons; }
}
