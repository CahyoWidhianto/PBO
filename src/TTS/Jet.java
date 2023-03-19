
package TTS;

import java.util.Arrays;

public class Jet extends Enemy{
    private int  harga;
    private int attackPoin;
    private String skill[]= new String[4];

    public Jet(int harga, int attackPoin, String name, String role, int hp) {
        super(name, role, hp);
        this.harga = harga;
        this.attackPoin = attackPoin;
    }


    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String s1, String s2, String s3, String s4) {
        skill[0]= s1;
        skill[1]= s2;
        skill[2]= s3;
        skill[3]= s4;
        
    }
    @Override
    public void attack() {
        System.out.println("attackk");
    }
    public void infoJet(){
        info();
        System.out.println("harga : " + harga);
        System.out.println("attackPoin : " + attackPoin);
    }
    public void tampilSkillJet(){
        System.out.println(Arrays.toString(skill));
    }
    public void fungsiJet(){
        System.out.println("fungsi Jet-duelist");
        System.out.println("entry wilayah musuh");
    }
    
}
