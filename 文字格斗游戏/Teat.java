package tom.jiafei.文字格斗游戏;

import tom.jiafei.文字格斗游戏.role;

public class Teat {
    public static void main(String args[]){
        role r1 = new role("骑士",50,'男');
        role r2 = new role("完犊子",50,'男');
       r1.showRoleInfo();
       r2.showRoleInfo();
         while (true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName()+"K.O"+r2.getName());
                break;
            }
           r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName()+"K.O"+r1.getName());
                break;
            }
        }

    }
}
