/**********************************************************************
 * $Source$
 * $Revision$
 * $Date$
 * $Author$
 * $Locker$
 * $State$
 *
 * Copyright (c) by willuhn software & services
 * All rights reserved
 *
 **********************************************************************/

package de.jost_net.JVerein.gui.internal.buttons;

import de.willuhn.jameica.gui.parts.Button;
import de.willuhn.jameica.system.Application;

/**
 * Vorkonfigurierter Zurueck-Button.
 */
public class Back extends Button
{
  /**
   * ct. Der Button ist als Default-Button markiert.
   */
  public Back()
  {
    this(true);
  }

  /**
   * ct.
   * 
   * @param isDefault
   *          true, wenn es der Default-Button sein soll.
   */
  public Back(boolean isDefault)
  {
    super(Application.getI18n().tr("&Zur�ck"),
        new de.willuhn.jameica.gui.internal.action.Back(), null, isDefault,
        "go-previous.png");
  }
}

/**********************************************************************
 * $Log$ Revision 1.1 2009/01/20 10:51:51 willuhn
 * 
 * @N Mehr Icons - fuer Buttons
 * 
 **********************************************************************/