package tom.jiafei.文字格斗游戏;

import java.util.Random;

public class role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyface = {"奇丑", "风流倜傥", "气宇轩昂"};
    String[] girlfaces = {"沉鱼落雁", "闭月羞花", "欺"};
    String[] attack_des = {
            "%s大喝一声，身形下符，一招【掌心雷】，打向%s",
            "%s上步，一招【龙爪手】，连攻向%s",
            "%s使出【一剑穿心】，飞身攻向%s"
    };
    String[] injureds_des = {
            "结果%s后退半步，毫发无伤",
            "结果%s口吐鲜血",
            "%s一声惨叫，倒下了"
    };
    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyface.length);
            this.face = boyface[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public role() {

    }

    public role(String name, int blood, char gender) {
        this.blood = blood;
        this.name = name;
        this.gender = gender;
        setFace(gender);
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(role p) {
        Random r = new Random();
        int index = r.nextInt(attack_des.length);
        String KungFu = attack_des[index];
        System.out.printf(KungFu,this.getName(),p.getName());
        System.out.println();
        //Random 只有一个，
        //Random r = new Random();
        //造成伤害
        int hurt = r.nextInt(20) + 1;
        int remainBooid = p.getBlood() - hurt;
        remainBooid = remainBooid < 0 ? 0 : remainBooid;
        //对剩余血量做一个验证
        p.setBlood(remainBooid);
        //System.out.println(this.getName() + "打了" + p.getName() + "一下，造成了" + hurt+ "伤害，还剩下" + p.getBlood() + "血");
        //受伤描述
        //若血量>40，0索引  10~20 ，1索引 0~10 ，2索引
        if(remainBooid >20){
            System.out.printf(injureds_des[0],p.getName());
        }else if(remainBooid >10&&remainBooid<20){
            System.out.printf(injureds_des[1],p.getName());
        }else  {
            System.out.printf(injureds_des[2],p.getName());
        }
        System.out.println();

    }

    public void showRoleInfo() {
        System.out.println("姓名：" + getName());
        System.out.println("长相：" + getFace());
        System.out.println("性别：" + getGender());
        System.out.println("血量：" + getBlood());
    }
}
