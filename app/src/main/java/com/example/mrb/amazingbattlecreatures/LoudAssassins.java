package com.example.mrb.amazingbattlecreatures;

/**
 * Created by ATu on 14/03/2016.
 */
public class LoudAssassins extends BattleCreature
{
    private int intLoudAttackAmount;

    public LoudAssassins (String strName_PARAM,
                          int intHitPoints_PARAM,
                          int intDefenceRating_PARAM,
                          int intOffenceRating_PARAM,
                          int intLoudAttackAmount_PARAM)
    {
        super(strName_PARAM, intHitPoints_PARAM, intDefenceRating_PARAM, intOffenceRating_PARAM);
        this.intLoudAttackAmount = intLoudAttackAmount_PARAM;
    }

    public void loudAttack(BattleCreature battcreatOpponent_PARAM)
    {
        if (!battcreatOpponent_PARAM.isDefeated())
        {
            battcreatOpponent_PARAM.defend(intLoudAttackAmount);
            strLastAction = strName + " has delivered a " + intLoudAttackAmount
                    + "-point Loud move!\n";
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
}

