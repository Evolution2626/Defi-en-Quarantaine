/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public interface USB {
        int DRIVER_GAMEPAD = 0;
        int CODRIVER_GAMEPAD = 1;
    }
    public interface AXES {
        int AXES_GAUCHE = 1;
        int AXES_DROITES = 5;
    }
    public interface CAN {
        int MOTEUR_AVANT_GAUCHE = 0;
        int MOTEUR_MILIEU_GAUCHE = 1;
        int MOTEUR_ARRIERE_GAUCHE = 2;
        int MOTEUR_AVANT_DROIT = 3;
        int MOTEUR_MILIEU_DROIT = 4;
        int MOTEUR_ARRIERE_DROIT = 5;
        int MOTEUR_MILIEU_MILIEU = 6;
    }
    public interface PCM {

    }
    public interface PWN {

    }
}
