/*
 * Created on Aug 12, 2004
 */
package com.realpersist.gef.editor;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite.FlyoutPreferences;


/**
 * Contains the preferences for the palette flyout
 * @author Phil Zoio
 */
public class PaletteFlyoutPreferences implements FlyoutPreferences
{

	public static final int DEFAULT_PALETTE_WIDTH = 150;

	protected static final String PALETTE_DOCK_LOCATION = "Dock location";
	protected static final String PALETTE_SIZE = "Palette Size";
	protected static final String PALETTE_STATE = "Palette state";

	public int getDockLocation()
	{
		return PositionConstants.WEST;
		/*
		int location = SchemaDiagramPlugin.getDefault().getPreferenceStore().getInt(PALETTE_DOCK_LOCATION);
		if (location == 0)
		{
			return PositionConstants.WEST;
		}
		return location;
		*/
	}

	public int getPaletteState()
	{
		int state = SchemaDiagramPlugin.getDefault().getPreferenceStore().getInt(PALETTE_STATE);
		return state;
	}

	public int getPaletteWidth()
	{
		return DEFAULT_PALETTE_WIDTH;
		/*
		int width = SchemaDiagramPlugin.getDefault().getPreferenceStore().getInt(PALETTE_SIZE);
		if (width == 0)
			return DEFAULT_PALETTE_WIDTH;
		return width;
		*/
	}

	public void setDockLocation(int location)
	{
		SchemaDiagramPlugin.getDefault().getPreferenceStore().setValue(PALETTE_DOCK_LOCATION, location);
	}

	public void setPaletteState(int state)
	{
		SchemaDiagramPlugin.getDefault().getPreferenceStore().setValue(PALETTE_STATE, state);
	}

	public void setPaletteWidth(int width)
	{
		SchemaDiagramPlugin.getDefault().getPreferenceStore().setValue(PALETTE_SIZE, width);
	}

}