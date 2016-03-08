package com.example.mrb.amazingbattlecreatures;

/**
 * Created by PBuskell on 08/03/2016.
 */
public class CyberBattleCreature extends BattleCreature
{
    private int intCyberAttackAmount;
    private int intCyberDefenceAmount;

    public CyberBattleCreature(String strName_PARAM,
                               int intHitPoints_PARAM,
                               int intDefenceRating_PARAM,
                               int intOffenceRating_PARAM,
                               int intCyberAttackAmount_PARAM,
                               int intCyberDefenceAmount_PARAM)
    {
        super(strName_PARAM, intHitPoints_PARAM, intDefenceRating_PARAM, intOffenceRating_PARAM);

        this.intCyberAttackAmount = intCyberAttackAmount_PARAM;
        this.intCyberDefenceAmount = intCyberDefenceAmount_PARAM;
    }

    public void attack(BattleCreature battcreatOpponent_PARAM)
    {
        if (!battcreatOpponent_PARAM.isDefeated())
        {
            battcreatOpponent_PARAM.defend(super.intOffenceRating);
        }

        if(battcreatOpponent_PARAM.isDefeated())
        {
            super.blnHasWon = true;
        }
        else
        {
            super.blnHasWon = false;
        }
    }

}
