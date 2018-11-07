package com.ptconsultancy.domain.guicomponents;

import static com.ptconsultancy.domain.guicomponents.GuiConstants.STANDARD_DROPDOWN_SELECT;

import java.util.ArrayList;
import javax.swing.JComboBox;

public class FreeComboBox extends JComboBox {

    public FreeComboBox(int x, int y, int xSize, int ySize) {
        this.setBounds(x, y, xSize, ySize);
        this.addItem(STANDARD_DROPDOWN_SELECT);
    }

    public FreeComboBox(int x, int y, int xSize, int ySize, ArrayList<String> items) {
        this(x, y, xSize, ySize);
        if (items != null) {
            for (String item : items) {
                this.addItem(item);
            }
        }
    }

    public void focusComboBox() {
        this.grabFocus();
    }

    public String getItem(int index) {
        return (String) this.getItemAt(index);
    }

    public String getSelectedItem() {
        return getItem(this.getSelectedIndex());
    }

    public void clearComboBox() {
        this.setSelectedIndex(0);
    }

    public void repopulateComboBox(ArrayList<String> items) {
        this.removeAllItems();
        for (String item : items) {
            this.addItem(item);
    }
    }
}
