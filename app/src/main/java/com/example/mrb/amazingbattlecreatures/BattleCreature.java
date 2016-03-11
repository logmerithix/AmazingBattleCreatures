package com.example.mrb.amazingbattlecreatures;

/**
 * Created by mrb on 16-03-02.
 */
public class BattleCreature
{
    protected String strName;
    private int intHitPointsMaster;
    private int intHitPoints; // Or perhaps it should be intHealthPoints?
    private int intDefenceRating;
    private int intOffenceRating;
    private boolean blnIsDefeated;
    protected boolean blnHasWon;
    protected String strLastAction;

    public BattleCreature(String strName_PARAM,
                               int intHitPoints_PARAM,
                               int intDefenceRating_PARAM,
                               int intOffenceRating_PARAM)
    {
        this.strName = strName_PARAM;

        this.intHitPointsMaster = intHitPoints_PARAM; // Needed to restore hit points
        this.intHitPoints = intHitPoints_PARAM;

        this.intDefenceRating = intDefenceRating_PARAM;
        this.intOffenceRating = intOffenceRating_PARAM;

        this.strLastAction = new String("");
    }

    public void restore()
    {
        intHitPoints = intHitPointsMaster; // Reset Hit Points from Master

        blnHasWon = false;
        blnIsDefeated = false;

        strLastAction = "";
    }

    public void attack(BattleCreature battcreatOpponent_PARAM)
    {
        if (!battcreatOpponent_PARAM.isDefeated())
        {
            battcreatOpponent_PARAM.defend(intOffenceRating);
            strLastAction = strName + " has delivered a " + intOffenceRating + " point attack!\n";
        }

        if(battcreatOpponent_PARAM.isDefeated())
        {
            blnHasWon = true;
        }
        else
        {
            blnHasWon = false;
        }
    }

    public void defend(int intOffenceAmount_PARAM)
    {
        int intNetDamage = intOffenceAmount_PARAM - intDefenceRating;

        if (intNetDamage >= intHitPoints)
        {
            intHitPoints = 0;
            blnIsDefeated = true;
            blnHasWon = false;
            strLastAction = strName + " is defeated.\n";
        }
        else if (intNetDamage > 0)
        {
            intHitPoints = intHitPoints - intNetDamage;
            strLastAction = strName + " has taken " + intNetDamage + " damage.\n";
        }
    }

    public String getName()
    {
        return strName;
    }

    public boolean hasWon()
    {
        return blnHasWon;
    }

    public boolean isDefeated()
    {
        return blnIsDefeated;
    }

    public String getLastAction()
    {
        return strLastAction;
    }

}
