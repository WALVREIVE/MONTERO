package com.company;

public class Boss  extends GameEntity {

        String nameBossB = "LEON DEMON HEART";
        Weapon e01 = new Weapon();
        public Boss() {}

        public String printInfo(){
            return health + " = THE HEALTH OF BOSS \n" + damage + " = THE DAMAGE OF BOSS \n" + nameBossB + " = THE NAME OF BOSS \n" + e01.getNameWeapon() + " = NAME OF THE WEAPON \n" + e01.getTypeOfWeapon() + " = TYPE OF THE WEAPON \n";
        }
    }

